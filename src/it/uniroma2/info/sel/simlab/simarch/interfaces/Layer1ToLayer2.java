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
import it.uniroma2.info.sel.simlab.simarch.data.Time;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.Layer2InternalException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.TimeAlreadyPassedException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.UnknownLocalRecipientException;

/**
 * Defines the layer 2 services offered to layer 1
 *
 * @author  Daniele Gianni
 * @version 1.0, 06-01-06
 */
public interface Layer1ToLayer2 {
            
    /**
     * Allows layer 1 (distributed simulation infrastructure) to schedule layer's 1 events (distributed events) into the layer 2 event list transparently
     *
     * @param e the event to be scheduled in layer's 2 internal event list
     * @see Event
     */
    public void scheduleEvent(Event e) throws UnknownLocalRecipientException, TimeAlreadyPassedException, Layer2InternalException;
    
    /**
     * Notifies to layer 2 that the distributed environment has reached the end of simulation
     *
     * @param t the time the simulation end event occurs
     * @see Time
     */
    public void scheduleSimulationEnd(Time t) throws TimeAlreadyPassedException, Layer2InternalException;
}
