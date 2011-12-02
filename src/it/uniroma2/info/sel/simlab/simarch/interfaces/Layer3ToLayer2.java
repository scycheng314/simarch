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

/**
 * Defines the layer 2 services offered to layer 3
 *
 * @author  Daniele Gianni
 * @version 1.0, 06/01/06
 */
public interface Layer3ToLayer2 extends Layer3ToLayer2UserInterface, Layer3ToLayer2DeveloperInterface {                       

    /*
     * Returns instances of the SimArch user interface, which includes the services
     * for the registration of entities and the activation of the engine
     */
    public Layer3ToLayer2UserInterface getUserInterface();

    /*
     * Returns instances of the SimArch developer interface, which include the services
     * for the sending/reception of events
     */
    public Layer3ToLayer2DeveloperInterface getDeveloperInterface();    
}
