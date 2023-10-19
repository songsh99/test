package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/*
 * Ȥ�� AOP ������ �ȵȴٸ�...
 *  �Ʒ��� ���� AutoProxy �� Ȱ��ȭ ��Ű��.
 */
@EnableAspectJAutoProxy
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
