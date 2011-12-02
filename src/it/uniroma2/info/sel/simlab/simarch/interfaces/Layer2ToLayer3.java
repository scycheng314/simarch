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

package it.uniroma2.info.sel.simlab.simarch.interfaces;

import it.uniroma2.info.sel.simlab.simarch.data.Event;
import it.uniroma2.info.sel.simlab.simarch.data.Name;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer3.Layer3Exception;

/**
 * Defines the layer 3 services offered to layer 2
 *
 * @author  Daniele Gianni
 * @version 1.0, 06/01/06
 */
public interface Layer2ToLayer3 {

    /* Contains the simulation logic associated to each simulation entity at layer 3
     *
     */
    public void body() throws Layer3Exception;

    /*
     * Returns the unique identifies of the simulation entity
     */
    public Integer getId();

    /*
     * Returns the simulation entity name
     */
    public Name getEntityName();

    /*
     * Prints on system.out statistics collected during the entity execution
     */
    public void printStatistics();

    /*
     * Informs the simulation entity that an event has been received
     */
    public void setEventReceived();

    /*
     * Sets into the simulation entity buffer the received event
     */
    public void setReceivedEvent(final Event e);

    /*
     * Sets the unique identifier for the entity
     */
    public void setId(final Integer i);

    /*
     * Set the system name - the simulation container within the entity is executed - into the entity
     */
    public void setSystemName(final Name s);    
}
