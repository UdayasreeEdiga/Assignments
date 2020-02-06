package cts.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movies")

public class Movie implements Comparable<Movie>{ 
	@Id
	private int mId;
	private String mname;
	
	@ManyToMany(mappedBy="movies")
	private Set<Artist> artists;

	public Movie() {
		super();
		
	}

	public Movie(int mId, String mname, Set<Artist> artists) {
		super();
		this.mId = mId;
		this.mname = mname;
		this.artists = artists;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
	public int compareTo(Movie m) {
		
		return (this.mId<m.mId?-1:(this.mId>m.mId?1:0));
	}
	
	
	
	
	

}
