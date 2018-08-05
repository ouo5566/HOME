package domain;

import lombok.Data;

@Data
public class RentBean {
	private String rentSeq, bookSeq, userid, rentDate, returnDate, overDueMoney;
}
