package mypack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("abc.xml");
		BeanFactory beanfactory=new XmlBeanFactory(res);
		Journey j=(Journey)beanfactory.getBean("id2");
		j.startJourney();
		
		
	}

}
