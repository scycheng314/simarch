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

import it.uniroma2.sel.simlab.simarch.exceptions.layer2.Layer2InternalException;
import it.uniroma2.sel.simlab.simarch.exceptions.layer2.UnableToStartEngineException;

/** Defines the services for SimArch users (i.e. Layer 3 simulation language users)
 *
 * @author Daniele Gianni
 */
public interface Layer3ToLayer2UserInterface {
    
    /**
     * Makes the simulation start after that all the configurations ({@code Entitiy}, {@code Link} and 
     * {@code Port} registrations) have taken place 
     */
    public void startEngine() throws UnableToStartEngineException, Layer2InternalException;
    
}
