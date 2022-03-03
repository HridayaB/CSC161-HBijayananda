package com.CSC161J.MyBookTree;

import java.util.ArrayList;

public class MyBookNode
{

	private String title;
	private int chapterNum;
	private int sectionNum;
	private int subSectionNum;
	public ArrayList < MyBookNode > childNodes;
	
	/**
	 * @param title
	 * @param chapterNum
	 * @param sectionNum
	 * @param subSectionNum
	 * @description auto-generated constructor
	 * @return
	 */
	public MyBookNode ( String title, int chapterNum, int sectionNum, int subSectionNum ) 
	{
		super ( );
		this.title = title;
		this.chapterNum = chapterNum;
		this.sectionNum = sectionNum;
		this.subSectionNum = subSectionNum;
		this.childNodes = new ArrayList < MyBookNode > ( );
	} // end of auto-generated constructor

	// getters and setters below
	public String getTitle ( ) 
	{
		return title;
	}

	public void setTitle ( String title ) 
	{
		this.title = title;
	}

	public int getChapterNum ( ) 
	{
		return chapterNum;
	}

	public void setChapterNum ( int chapterNum ) 
	{
		this.chapterNum = chapterNum;
	}

	public int getSectionNum ( ) 
	{
		return sectionNum;
	}

	public void setSectionNum ( int sectionNum ) 
	{
		this.sectionNum = sectionNum;
	}

	public int getSubSectionNum ( ) 
	{
		return subSectionNum;
	}

	public void setSubSectionNum ( int subSectionNum ) 
	{
		this.subSectionNum = subSectionNum;
	}
	
	public ArrayList < MyBookNode > getChildNodes ( ) 
	{
		return childNodes;
	}

	public void setChildNodes ( ArrayList < MyBookNode > childNodes ) 
	{
		this.childNodes = childNodes;
	}
	// end of getters and setters
	
	@Override
	public String toString ( )
	{
		if ( chapterNum == 0 )
		{
			return title;
		} // end of if statement
		if ( sectionNum == 0 )
		{
			return ( "\t" + chapterNum + " " + title );
		} // end of if statement
		if ( subSectionNum == 0 )
		{
			return ( "\t\t" + chapterNum + "." + sectionNum +" " + title );
		} // end of if statement
		return ( "\t\t\t" + chapterNum + "." + sectionNum + "." + subSectionNum + " " + title );
	} // end of toString method
	
} // end of class MyBookNode
