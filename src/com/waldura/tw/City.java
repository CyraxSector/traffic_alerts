/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.waldura.tw;

/**
 *
 * @author Prasan
 */
public final class City implements Comparable<City>{

    /**
	 * The largest possible number of cities.
	 */
	public static final int MAX_NUMBER = 26;

	private static final City[] cities = new City[MAX_NUMBER];

	static
	{
        // initialize all City objects
		for (char c = 'A'; c <= 'Z'; c++)
		{
			cities[getIndexForName(c)] = new City(c);
		}
	}

	private static int getIndexForName(char name)
	{
		return name - 'A';
	}

	private static char getNameForIndex(int index)
	{
		return (char)('A' + index);
	}

	public static final City A = City.valueOf('A');
	public static final City B = City.valueOf('B');
	public static final City C = City.valueOf('C');
	public static final City D = City.valueOf('D');
	public static final City E = City.valueOf('E');
    public static final City F = City.valueOf('F');

	public static City valueOf(char name)
	{
		if (name < 'A' || name > 'Z')
		{
			throw new IllegalArgumentException("Invalid city name: " + name);
		}

		return cities[getIndexForName(name)];
	}

    /*
     * Package members only.
     */
	static City valueOf(int n)
	{
		if (n < 0 || n > 25)
		{
			throw new IllegalArgumentException("Invalid city number: " + n);
		}

		return valueOf( getNameForIndex(n) );
	}

	private final char name;

    /**
     * Private constructor.
     * @param name
     */
	private City(char name)
	{
		this.name = name;
	}

	public char getName()
	{
		return name;
	}

    /*
     * Package members only.
     */
	int getIndex()
	{
		return getIndexForName(name);
	}

    /**
     * @see java.lang.Object#toString()
     */
	public String toString()
	{
		return String.valueOf(name);
	}

    /**
     * Two cities are considered equal if they are the same object,
     * or their names are the same.
     *
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(Object o)
    {
        return this == o || equals((City) o);
    }

    private boolean equals(City c)
    {
        return this.name == c.name;
    }

    /**
     * Compare two cities by name.
     *
     * @see java.lang.Comparable#compareTo(Object)
     */
    public int compareTo(City c)
    {
        return this.name - c.name;
    }

}
