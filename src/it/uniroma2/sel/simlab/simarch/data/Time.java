/*
 * 	Copyright (C) 2005-2011 Department of Enteprise Engineering, University of Rome "Tor Vergata"
 *                              ( http://www.dii.uniroma2.it )
 *
 *      This file is part of SimArch and was developed at the Software Engineering Laboratory
 *      ( http://www.sel.uniroma2.it )
 *
 *      SimArch is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      (at your option) any later version.
 *
 *      SimArch is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with SimArch.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package it.uniroma2.sel.simlab.simarch.data;

/**
 * Defines the Time data type exchanged between the several layers of this architecture
 *
 * @author  Daniele Gianni
 * @version 1.0, 06-01-06
 * @see it.uniroma2.info.sel.simlab.simarch simarch
 */
public interface Time extends Comparable<Time> {
    
    /* time zero */
    public static final Double ZERO = new Double(0.0);
    
    /* time infinite */
    public static final Double INFINITY = Double.POSITIVE_INFINITY;
    

    /*
     * Decrease this object by the value of t
     */
    public void decreaseBy(final Time t); 

    /*
     * Returns a decreased Time object, of value this.value - t.value
     */
    public Time decreasedBy(final Time t);
    
    /** 
     * Adds the time {@code t} to the current time
     *
     * @param t the time to add
     */
    public void increaseBy(final Time t);
        
    /** 
     * Creates a new instance of Time at current value plus {@code t}.
     * The current value will not be modified.
     *
     * @param t the time to add 
     * @return getValue() + t
     */
    public Time increasedBy(final Time t);
    
    /** 
     * Sets the current value at {@code n}
     *
     * @param n the new value 
     */
    public void setValue(final Number n); 
    
    /** 
     * Sets the current value at {@code d}
     *
     * @param d the new value 
     */
    public void setValue(final double d); 
    
    /** 
     * Gets the current time value
     *
     * @return the time value 
     */
    public double getValue(); 
        
    public int compareTo(final Time o);
    
    /** 
     * Makes the specified test between the current value and {@code t}
     */
    public boolean isGreaterThan(final Time t);
    
    /** 
     * Makes the specified test between the current value and {@code t}
     */
    public boolean isGreaterOrEqualThan(final Time t);
    
    /** 
     * Makes the specified test between the current value and {@code t}
     */
    public boolean isLesserThan(final Time t); 
    
    /** 
     * Makes the specified test between the current value and {@code t}
     */
    public boolean isLesserOrEqualThan(final Time t); 
}
