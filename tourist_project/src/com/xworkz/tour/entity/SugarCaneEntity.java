package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sugarcane_details")
public class SugarCaneEntity {
	
		@Id
		@Column (name="cid")
		private int id;
		@Column (name="cname")
		private String name;
		@Column (name="factoryName")
		private String factoryName;
		@Column (name="c_quantity")
		private int quatity;
		@Column (name="cityName")
		private String cityName;
		public SugarCaneEntity() {
			
		}
		public SugarCaneEntity(int id, String name, String factoryName, int quatity, String cityName) {
			super();
			this.id = id;
			this.name = name;
			this.factoryName = factoryName;
			this.quatity = quatity;
			this.cityName = cityName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFactoryName() {
			return factoryName;
		}
		public void setFactoryName(String factoryName) {
			this.factoryName = factoryName;
		}
		public int getQuatity() {
			return quatity;
		}
		public void setQuatity(int quatity) {
			this.quatity = quatity;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		@Override
		public String toString() {
			return "SugarCaneEntity [id=" + id + ", name=" + name + ", factoryName=" + factoryName + ", quatity=" + quatity
					+ ", cityName=" + cityName + "]";
		}

}
