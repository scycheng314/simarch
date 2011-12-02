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

package it.uniroma2.info.sel.simlab.simarch.data;

/**
 * Defines the interface for the Event data exchanged between adjacent layers of this architecture
 *
 * @author  Daniele Gianni
 * @version 1.0, 06-01-06
 * @see it.uniroma2.info.sel.simlab.simarch
 */
public interface Event extends Comparable {
      
    /**
     * 
     * Gets the sender {@code GeneralEntity}
     * 
     * 
     * @return the sender
     * @see GeneralEntity
     */
    public GeneralEntity getSender();
    
    /**
     * 
     * Gets the sender name
     * 
     * 
     * @return the sender name
     * @see GeneralEntity
     */
    public Name getSenderName();      
    
    /**
     * 
     * Gets the recipient {@code GeneralEntity}
     * 
     * 
     * @return the recipient
     * @see .GeneralEntity
     */
    public GeneralEntity getRecipient();
    
    /**
     * 
     * Gets the recipient name
     * 
     * 
     * @return the recipient name
     * @see GeneralEntity
     */
    public Name getRecipientName();
    
    /** 
     * Gets the event time
     *
     * @return the time 
     * @see Time
     */
    public Time getTime();
    
    /** 
     * Gets the event data
     *
     * @return the data 
     */
    public Object getData();
    
    /** 
     * Gets the event tag
     *
     * @return the tag 
     */
    public Enum getTag();
}
