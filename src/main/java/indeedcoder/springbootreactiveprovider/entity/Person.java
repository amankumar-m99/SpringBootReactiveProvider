package indeedcoder.springbootreactiveprovider.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

	@Id
	private String id; //primary key would be auto-provided by MongoDB if left null (not otherwise)
	private Integer pId;
	private String name;

}
