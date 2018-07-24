package in.app.test;

import in.app.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

	
public class TestDataSource {
	@Transactional(value="transactionManager_iwpro_imp", rollbackFor = Exception.class)
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds = ctx.getBean(DataSource.class);
		JdbcTemplate jt = new JdbcTemplate(ds);
		
		String sql = "INSERT INTO user('name', 'phone', 'email', 'address', 'loginName', 'password') VALUES(?,?,?,?,?,?)";
		
		Object[] param = new Object[]{"Amit","45859575","akabra@gmil.com","Sweden","amitkabra59","root"};
		jt.update(sql, param);
		System.out.println("SQL Executed");

	}

}
