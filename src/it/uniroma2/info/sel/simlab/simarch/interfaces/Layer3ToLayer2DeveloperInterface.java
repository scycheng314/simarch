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

import it.uniroma2.info.sel.simlab.simarch.data.GeneralEntity;
import it.uniroma2.info.sel.simlab.simarch.data.Name;
import it.uniroma2.info.sel.simlab.simarch.data.OutputPort;
import it.uniroma2.info.sel.simlab.simarch.data.Time;
import it.uniroma2.info.sel.simlab.simarch.exceptions.InvalidNameException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.Layer2InternalException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.TimeAlreadyPassedException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.UnableToRegisterEntityException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.UnknownRecipientException;
import it.uniroma2.info.sel.simlab.simarch.exceptions.layer2.UnlinkedPortException;

/** Defines the interface used by SimArch developers to implement simulation
 * languages at Layer 3
 *
 * @author Daniele Gianni
 */
public interface Layer3ToLayer2DeveloperInterface {

    /*
     * Returns Layer 2 clock time
     */
    public Time getClock();

    /*
     *
     */
    public Name getFullName();

    /*
     * Returns system name
     */
    public Name getSystemName();

    /*
     * Block the invoking entity until a new event is received
     */
    public void waitNextEvent() throws Layer2InternalException; //);

    /*
     * Holds the invoking entity for the specified time t
     */
    public void hold(final Time t) throws Layer2InternalException;

    /*
     * Holds the invoking entity for the specified time t, if no events are received
     * before t. Otherwise, the method will return upon reception of the event
     */
    public boolean holdUnlessIncomingEvent(final Time t) throws Layer2InternalException;

    /*
     * Scheduling of a SimArch event using a GeneralEntity interface as reference
     * to the event recipient
     */
    public void send(final GeneralEntity dest, final Time delay, final Enum tag, final Object data) throws UnknownRecipientException, TimeAlreadyPassedException, Layer2InternalException;

    /*
     * Scheduling of a SimArch event using a OutputPort interface as reference
     * to the event recipient
     */
    public void send(final OutputPort o, final Time delay, final Enum tag, final Object data) throws UnlinkedPortException, TimeAlreadyPassedException, Layer2InternalException;

    /*
     * Scheduling of a SimArch event using a Name interface as reference
     * to the event recipient
     */
    public void send(final Name dest, final Time delay, final Enum tag, final Object data) throws UnknownRecipientException, TimeAlreadyPassedException, Layer2InternalException, InvalidNameException;
    
    /**
     * Includes entity {@code e} into the simulation system
     * 
     * 
     * @param e the entity to be included
     * @see GeneralEntity
     */
    public void registerEntity() throws Layer2InternalException, UnableToRegisterEntityException;          
    
}

