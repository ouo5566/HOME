package domain;

import lombok.Data;

@Data
public class UserBean {
	private String userid, password, name, birth, gender, level, discountRate, rent;
}
