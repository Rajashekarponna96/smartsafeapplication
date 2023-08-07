package com.safesmart.safesmart.mangerreport;

import java.util.ArrayList;
import java.util.List;

import com.safesmart.safesmart.dto.ChangeRequestDto;
import com.safesmart.safesmart.dto.ValetDenominationsDto;

public class changeValetDenomiDtoMangerChangeRe {

	private Long id;



	@Override
	public String toString() {
		return "changeValetDenomiDtoMangerChangeRe [id=" + id + ", old_cents=" + old_cents + ", new_cents=" + new_cents
				+ ", old_nickels=" + old_nickels + ", new_nickels=" + new_nickels + ", old_dimes=" + old_dimes
				+ ", new_dimes=" + new_dimes + ", old_quarters=" + old_quarters + ", new_quarters=" + new_quarters
				+ ", old_den_1$=" + old_den_1$ + ", new_den_1$=" + new_den_1$ + ", old_den_5$=" + old_den_5$
				+ ", new_den_5$=" + new_den_5$ + ", old_den_10$=" + old_den_10$ + ", new_den_10$=" + new_den_10$
				+ ", old_den_20$=" + old_den_20$ + ", new_den_20$=" + new_den_20$ + ", old_den_50$=" + old_den_50$
				+ ", new_den_50$=" + new_den_50$ + ", old_den_100$=" + old_den_100$ + ", new_den_100$=" + new_den_100$
				+ ", type=" + type + ", updatedByUser=" + updatedByUser + ", valetDenominationsId="
				+ valetDenominationsId + ", valetDenominationsDto=" + valetDenominationsDto + ", changeRequestId="
				+ changeRequestId + ", changeRequestDto=" + changeRequestDto + ", updatedTime=" + updatedTime + "]";
	}

	private Integer old_cents;

	
	public changeValetDenomiDtoMangerChangeRe() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer new_cents;

	private Integer old_nickels;

	private Integer new_nickels;

	private Integer old_dimes;

	private Integer new_dimes;

	private Integer old_quarters;

	private Integer new_quarters;

	private Integer old_den_1$;

	private Integer new_den_1$;

	private Integer old_den_5$;

	private Integer new_den_5$;

	private Integer old_den_10$;

	private Integer new_den_10$;

	private Integer old_den_20$;

	private Integer new_den_20$;

	private Integer old_den_50$;

	private Integer new_den_50$;

	private Integer old_den_100$;

	private Integer new_den_100$;

	private String type;

	private Long updatedByUser;

	private Long valetDenominationsId;
	
	private ValetDenominationsDto valetDenominationsDto;
	
	private Long changeRequestId;
	
	private ChangeRequestDto changeRequestDto;
	
	private String updatedTime;
	
	
	
	
		public List<denominationDto> difference(changeValetDenomiDtoMangerChangeRe c){
		
		List<denominationDto> list = new ArrayList<denominationDto>();
		int in = 0;
		int out = 0;
		
		int diff = this.old_cents-c.old_cents;
		if((diff)<=0) {
			out+=c.getNew_cents();
			list.add(new denominationDto("Pennies","$"+c.getNew_cents(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("Pennies","$"+0,"$"+Integer.toString(diff)));
	
		}

		diff = this.old_nickels-c.old_nickels;
		if((diff)<=0) {
			out+=c.getNew_nickels();
			list.add(new denominationDto("Nickels","$"+c.getNew_nickels(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("Nickels","$"+0,"$"+Integer.toString(diff)));
	
		}

		diff= this.old_dimes-c.old_dimes;
		if((diff)<=0) {
			out+=c.getNew_dimes();
			list.add(new denominationDto("Dimes","$"+c.getNew_dimes(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("Dimes","$"+0,"$"+Integer.toString(diff)));
		}

		diff = this.old_quarters -c.old_quarters;
		if((diff)<=0) {
			out+=c.getNew_quarters();
			list.add(new denominationDto("Quarters","$"+c.getNew_quarters(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("Quarters","$"+0,"$"+Integer.toString(diff)));
	
		}
	
		diff = this.old_den_1$-c.old_den_1$;
		if((diff)<=0) {
			out+=c.getNew_den_1$();
			list.add(new denominationDto("$1","$"+c.getNew_den_1$(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$1","$"+0,"$"+Integer.toString(diff)));
	
		}

		diff = this.old_den_5$-c.old_den_5$;
		if((diff)<=0) {
			out+=c.getNew_den_5$();
			list.add(new denominationDto("$5","$"+c.getNew_den_5$(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$5","$"+0,"$"+Integer.toString(diff)));
	
		}

		diff = this.old_den_10$-c.old_den_10$;
		if((diff)<=0) {
			out+=c.getNew_den_10$();
			list.add(new denominationDto("$10","$"+c.getNew_den_10$(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$10","$"+0,"$"+Integer.toString(diff)));

		}

		diff = this.old_den_20$-c.old_den_20$;
		if((diff)<=0) {
			out+=c.getNew_den_20$();
			list.add(new denominationDto("$20","$"+c.getNew_den_20$(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$20","$"+0,"$"+Integer.toString(diff)));

		}
	
		diff = this.old_den_50$-c.old_den_50$;
		if((diff)<=0) {
			out+=c.getNew_den_50$();
			list.add(new denominationDto("$50","$"+c.getNew_den_50$(),"$"+0));

		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$50","$"+0,"$"+Integer.toString(diff)));

		}

		diff = this.old_den_100$-c.old_den_100$;
		if((diff)<=0) {
			out+=c.getNew_den_100$();
			list.add(new denominationDto("$100","$"+c.getNew_den_100$(),"$"+0));
	
		}
		if((diff)>0) {
			in+=diff;
			list.add(new denominationDto("$100","$"+0,"$"+Integer.toString(diff)));
	
		}
	
		
		list.add(new denominationDto("Total" ,"$"+Integer.toString(out),"$"+Integer.toString(in)));
		 
		return list;
	}




		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public Integer getOld_cents() {
			return old_cents;
		}




		public void setOld_cents(Integer old_cents) {
			this.old_cents = old_cents;
		}




		public Integer getNew_cents() {
			return new_cents;
		}




		public void setNew_cents(Integer new_cents) {
			this.new_cents = new_cents;
		}




		public Integer getOld_nickels() {
			return old_nickels;
		}




		public void setOld_nickels(Integer old_nickels) {
			this.old_nickels = old_nickels;
		}




		public Integer getNew_nickels() {
			return new_nickels;
		}




		public void setNew_nickels(Integer new_nickels) {
			this.new_nickels = new_nickels;
		}




		public Integer getOld_dimes() {
			return old_dimes;
		}




		public void setOld_dimes(Integer old_dimes) {
			this.old_dimes = old_dimes;
		}




		public Integer getNew_dimes() {
			return new_dimes;
		}




		public void setNew_dimes(Integer new_dimes) {
			this.new_dimes = new_dimes;
		}




		public Integer getOld_quarters() {
			return old_quarters;
		}




		public void setOld_quarters(Integer old_quarters) {
			this.old_quarters = old_quarters;
		}




		public Integer getNew_quarters() {
			return new_quarters;
		}




		public void setNew_quarters(Integer new_quarters) {
			this.new_quarters = new_quarters;
		}




		public Integer getOld_den_1$() {
			return old_den_1$;
		}




		public void setOld_den_1$(Integer old_den_1$) {
			this.old_den_1$ = old_den_1$;
		}




		public Integer getNew_den_1$() {
			return new_den_1$;
		}




		public void setNew_den_1$(Integer new_den_1$) {
			this.new_den_1$ = new_den_1$;
		}




		public Integer getOld_den_5$() {
			return old_den_5$;
		}




		public void setOld_den_5$(Integer old_den_5$) {
			this.old_den_5$ = old_den_5$;
		}




		public Integer getNew_den_5$() {
			return new_den_5$;
		}




		public void setNew_den_5$(Integer new_den_5$) {
			this.new_den_5$ = new_den_5$;
		}




		public Integer getOld_den_10$() {
			return old_den_10$;
		}




		public void setOld_den_10$(Integer old_den_10$) {
			this.old_den_10$ = old_den_10$;
		}




		public Integer getNew_den_10$() {
			return new_den_10$;
		}




		public void setNew_den_10$(Integer new_den_10$) {
			this.new_den_10$ = new_den_10$;
		}




		public Integer getOld_den_20$() {
			return old_den_20$;
		}




		public void setOld_den_20$(Integer old_den_20$) {
			this.old_den_20$ = old_den_20$;
		}




		public Integer getNew_den_20$() {
			return new_den_20$;
		}




		public void setNew_den_20$(Integer new_den_20$) {
			this.new_den_20$ = new_den_20$;
		}




		public Integer getOld_den_50$() {
			return old_den_50$;
		}




		public void setOld_den_50$(Integer old_den_50$) {
			this.old_den_50$ = old_den_50$;
		}




		public Integer getNew_den_50$() {
			return new_den_50$;
		}




		public void setNew_den_50$(Integer new_den_50$) {
			this.new_den_50$ = new_den_50$;
		}




		public Integer getOld_den_100$() {
			return old_den_100$;
		}




		public void setOld_den_100$(Integer old_den_100$) {
			this.old_den_100$ = old_den_100$;
		}




		public Integer getNew_den_100$() {
			return new_den_100$;
		}




		public void setNew_den_100$(Integer new_den_100$) {
			this.new_den_100$ = new_den_100$;
		}




		public String getType() {
			return type;
		}




		public void setType(String type) {
			this.type = type;
		}




		public Long getUpdatedByUser() {
			return updatedByUser;
		}




		public void setUpdatedByUser(Long updatedByUser) {
			this.updatedByUser = updatedByUser;
		}




		public Long getValetDenominationsId() {
			return valetDenominationsId;
		}




		public void setValetDenominationsId(Long valetDenominationsId) {
			this.valetDenominationsId = valetDenominationsId;
		}




		public ValetDenominationsDto getValetDenominationsDto() {
			return valetDenominationsDto;
		}




		public void setValetDenominationsDto(ValetDenominationsDto valetDenominationsDto) {
			this.valetDenominationsDto = valetDenominationsDto;
		}




		public Long getChangeRequestId() {
			return changeRequestId;
		}




		public void setChangeRequestId(Long changeRequestId) {
			this.changeRequestId = changeRequestId;
		}




		public ChangeRequestDto getChangeRequestDto() {
			return changeRequestDto;
		}




		public void setChangeRequestDto(ChangeRequestDto changeRequestDto) {
			this.changeRequestDto = changeRequestDto;
		}




		public String getUpdatedTime() {
			return updatedTime;
		}




		public void setUpdatedTime(String updatedTime) {
			this.updatedTime = updatedTime;
		}
	
		
	
}
