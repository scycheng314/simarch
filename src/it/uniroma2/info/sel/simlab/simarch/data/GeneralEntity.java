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
 * Defines the interface for the GeneralEntity data exchanged between the several layers of this architecture
 * <p>
 * Please see the <a href="{@docRoot}/license.html">User License Agreement</a>.
 * 
 * 
 * @author Daniele Gianni
 * @version 1.0, 06-01-06
 * @see it.uniroma2.info.sel.simlab.simarch
 */
public interface GeneralEntity {
        
    public Integer getEntityId();   
    
    public RemoteEntity getAsRemoteEntity();

    public boolean isLocal();
    /**
     * 
     * Gets the GeneralEntity <i>local</i> name that is the name which identifies the entity in a local system
     * 
     * @return the <i>local</i> name
     */
    public Name getEntityName();
        
    /**
     * 
     * Gets the {@code GeneralEntity} <i>full</i> name that is the name which identifies the entity in a distributed system.
     * It is basically a concat of the {@link #getSystemName() SystemName}
     * with the {@link #getEntityName() EntityName}
     * 
     * 
     * @return the <i>full</i> name
     */
    public Name getFullName();
        
    /**
     * 
     * Gets the {@code GeneralEntity} <i>system</i> name that is name of the system the entity is running on.
     * 
     * 
     * @return the <i>system</i> name
     */
    public Name getSystemName();    
}
