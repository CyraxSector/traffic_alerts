/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.waldura.tw;

import java.util.List;
/**
 *
 * @author Prasan
 */
public interface RoutesMap {

    /**
	 * Enter a new segment in the graph.
	 */
	public void addDirectRoute(City start, City end, int distance);

	/**
	 * Get the value of a segment.
	 */
	public int getDistance(City start, City end);

	/**
	 * Get the list of cities that can be reached from the given city.
	 */
	public List<City> getDestinations(City city);

	/**
	 * Get the list of cities that lead to the given city.
	 */
	public List<City> getPredecessors(City city);

	/**
	 * @return the transposed graph of this graph, as a new RoutesMap instance.
	 */
	public RoutesMap getInverse();

}
