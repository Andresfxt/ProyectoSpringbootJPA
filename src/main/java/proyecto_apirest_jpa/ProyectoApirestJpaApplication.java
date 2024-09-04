package proyecto_apirest_jpa;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ProyectoApirestJpaApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(ProyectoApirestJpaApplication.class, args);

		//ConfigurableApplicationContext context=SpringApplication.run(ProyectoApirestJpaApplication.class, args);
//		UsuarioRepository repository=context.getBean(UsuarioRepository.class);
//		UserNameRepository RepositoryuserName=context.getBean(UserNameRepository.class);
//		System.out.println(repository.count());
//
//		//crear y almacenar registros
//
//		UserName username_a=new UserName(null,"pruebas@gmail.com","Nuevaclave");
//		Usuario usuario_a=new Usuario(null,"365214789","12365479","Lopez","Perez","Angie",username_a);
//		RepositoryuserName.save(username_a);
//		repository.save(usuario_a);
//
//		UserName username_b=new UserName(null,"test@gmail.com","Nueva123");
//		Usuario usuario_b=new Usuario(null,"12365478","80808080","Suarez","Leon","Paola",username_b);
//		RepositoryuserName.save(username_b);
//		repository.save(usuario_b);
//
//		UserName username_c=new UserName(null,"anny@gmail.com","Clavedos");
//		Usuario usuario_c=new Usuario(null,"31985471","901741741","Jimenez","Ruiz","Anny",username_c);
//		RepositoryuserName.save(username_c);
//		repository.save(usuario_c);



	}

}
