package action;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import model.Student;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.BeanToCsv;
import com.opencsv.bean.ColumnPositionMappingStrategy;

import com.opencsv.bean.CsvToBean;



public class ImportCSV {

	public static void main(String[] args) {
		//main
		CSVReader csvReader = null;
		CSVWriter csvWriter = null;
		try
        {
			//---------------------------------------------------csv to bean--------------------------------//
            csvReader = new CSVReader(new FileReader("C:/Users/Bhakti/Downloads/FL_insurance_sample/student_sample.csv"),',','"',1);
            ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
            mappingStrategy.setType(Student.class);
            String[] columns = new String[]{"id","name","city"};
            mappingStrategy.setColumnMapping(columns);
            CsvToBean ctb = new CsvToBean();
            List<Student> studentList = ctb.parse(mappingStrategy,csvReader);
            for(Student studentobj : studentList)
            {
            	System.out.println(studentobj.getId()+"   "+studentobj.getName()+"   "
                		+studentobj.getCity());

            }
            
            //---------------------------------------------------bean to csv--------------------------------//
            csvWriter = new CSVWriter(new FileWriter("C:/Users/Bhakti/Downloads/FL_insurance_sample/student_sample_modified.csv"));
            BeanToCsv bc = new BeanToCsv();
            bc.write(mappingStrategy,csvWriter,studentList);
            

            
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
		{
			try
			{
				//closing the reader
				csvReader.close();
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
	}

}
