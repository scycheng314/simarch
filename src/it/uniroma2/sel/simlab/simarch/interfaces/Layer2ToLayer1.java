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

package it.uniroma2.sel.simlab.simarch.interfaces;

import it.uniroma2.sel.simlab.simarch.data.Event;
import it.uniroma2.sel.simlab.simarch.data.Name;
import it.uniroma2.sel.simlab.simarch.data.Time;

import it.uniroma2.sel.simlab.simarch.exceptions.layer1.GlobalSimulationTimeAlreadyPassedException;
import it.uniroma2.sel.simlab.simarch.exceptions.layer1.DistributedSimulationInfrastructureInternalException;
import it.uniroma2.sel.simlab.simarch.exceptions.layer1.UnknownDistributedSystemRecipientException;

/**
 * Defines the layer 1 services offered to layer 2
 *
 * @author  Daniele Gianni
 * @version 1.0, 06/01/06
 */
public interface Layer2ToLayer1 {
    
    /**
     * Gets the distributed environment ready to operate according the DES conceptual framework
     */
    public void initDistributedSimulationInfrastructure() throws DistributedSimulationInfrastructureInternalException;
    
    /** 
     * Gets the system name
     */
    public Name getSystemName();
    
    /**
     * Gets the distributed environment finish off the DES execution
     */
    public void postProcessDistributedSimulationInfrastructure() throws DistributedSimulationInfrastructureInternalException;
    
    /**
     * Blocks the current thread until a distributed event is received
     */
    public void waitNextDistributedEvent() throws DistributedSimulationInfrastructureInternalException;
    
    /**
     * Blocks the current thread until a distributed event is received or the distributed time {@code t}
     * is reached.
     * <p>
     * When the method returns it is guarranted that there are no distributed events before time {@code t}
     *
     * @param   t the time to be reached
     * @see     Time Time
     */
    public void waitNextDistributedEventBeforeTime(final Time t) throws DistributedSimulationInfrastructureInternalException, GlobalSimulationTimeAlreadyPassedException;
    
    /**
     * Sends Event {@code e} along the distributed environment that will take care of deliverying to the 
     * proper federate
     *
     * @param   e the event to be sent
     * @throws  if the event {@code e} can not be sent out as the distributed logical time is greater than 
     *          the local one
     * @see     Event
     * 
     */
    public void sendEvent(Event e) throws GlobalSimulationTimeAlreadyPassedException, UnknownDistributedSystemRecipientException, DistributedSimulationInfrastructureInternalException;
}
