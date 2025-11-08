package in.MohdTauseefKhan.Resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds =  new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://root:tEjSLcIqzRObkmeUCFlBhLodqSUJQOeP@switchback.proxy.rlwy.net:37390/railway");
		ds.setUsername("root");
		ds.setPassword("tEjSLcIqzRObkmeUCFlBhLodqSUJQOeP");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
	}
}
