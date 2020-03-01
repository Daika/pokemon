package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pokemon {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	 
	    @Column(nullable = false, unique = true)
	    private String title;
	 
	    @Column(nullable = false)
	    private String desc;
	    
	    
	    @Column(nullable = true)
	    private String cara1;
	    
	    @Column(nullable = true)
	    private String cara2;
	    
	    @Column(nullable = true)
	    private String cara3;
	    
	    @Column(nullable = true)
	    private String cara4;

		public Pokemon() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Pokemon(long id, String title, String desc, String cara1, String cara2, String cara3, String cara4) {
			super();
			this.id = id;
			this.title = title;
			this.desc = desc;
			this.cara1 = cara1;
			this.cara2 = cara2;
			this.cara3 = cara3;
			this.cara4 = cara4;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getCara1() {
			return cara1;
		}

		public void setCara1(String cara1) {
			this.cara1 = cara1;
		}

		public String getCara2() {
			return cara2;
		}

		public void setCara2(String cara2) {
			this.cara2 = cara2;
		}

		public String getCara3() {
			return cara3;
		}

		public void setCara3(String cara3) {
			this.cara3 = cara3;
		}

		public String getCara4() {
			return cara4;
		}

		public void setCara4(String cara4) {
			this.cara4 = cara4;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cara1 == null) ? 0 : cara1.hashCode());
			result = prime * result + ((cara2 == null) ? 0 : cara2.hashCode());
			result = prime * result + ((cara3 == null) ? 0 : cara3.hashCode());
			result = prime * result + ((cara4 == null) ? 0 : cara4.hashCode());
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pokemon other = (Pokemon) obj;
			if (cara1 == null) {
				if (other.cara1 != null)
					return false;
			} else if (!cara1.equals(other.cara1))
				return false;
			if (cara2 == null) {
				if (other.cara2 != null)
					return false;
			} else if (!cara2.equals(other.cara2))
				return false;
			if (cara3 == null) {
				if (other.cara3 != null)
					return false;
			} else if (!cara3.equals(other.cara3))
				return false;
			if (cara4 == null) {
				if (other.cara4 != null)
					return false;
			} else if (!cara4.equals(other.cara4))
				return false;
			if (desc == null) {
				if (other.desc != null)
					return false;
			} else if (!desc.equals(other.desc))
				return false;
			if (id != other.id)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "PokemonDTO [id=" + id + ", title=" + title + ", desc=" + desc + ", cara1=" + cara1 + ", cara2="
					+ cara2 + ", cara3=" + cara3 + ", cara4=" + cara4 + "]";
		}
}
