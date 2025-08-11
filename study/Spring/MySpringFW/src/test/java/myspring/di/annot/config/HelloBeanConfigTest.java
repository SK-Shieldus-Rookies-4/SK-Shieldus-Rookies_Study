package myspring.di.annot.config;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(
		classes = HelloBeanConfig.class,
		loader= AnnotationConfigContextLoader.class)
//=> loader에 대한 설명 : @Configuration을 위한 특별한 컨테이너 클래스인 AnnotationConfigApplicationContext 객체를 로딩해주는 역
public class HelloBeanConfigTest {

	@Autowired
	HelloBean hello;
}
