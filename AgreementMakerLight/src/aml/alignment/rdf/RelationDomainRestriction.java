/******************************************************************************
* Copyright 2013-2018 LASIGE                                                  *
*                                                                             *
* Licensed under the Apache License, Version 2.0 (the "License"); you may     *
* not use this file except in compliance with the License. You may obtain a   *
* copy of the License at http://www.apache.org/licenses/LICENSE-2.0           *
*                                                                             *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                              *
*                                                                             *
*******************************************************************************
* A RelationDomainRestriction represents the set of relations whose domain    *
* falls under the given restriction.                                          *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml.alignment.rdf;

import java.util.Collection;
import java.util.Vector;

public class RelationDomainRestriction extends RelationExpression
{

//Propertys
	
	private ClassExpression rest;
	
//Constructor
	
	/**
	 * Constructs a new PropertyDomainRestriction with the class expression as domain
	 * @param rest: the class expression defining the domain
	 */
	public RelationDomainRestriction(ClassExpression rest)
	{
		super();
		this.rest = rest;
		elements.addAll(rest.getElements());
	}
	
//Public Methods
	
	@Override
	public boolean equals(Object o)
	{
		return o instanceof RelationDomainRestriction &&
				((RelationDomainRestriction)o).rest.equals(this.rest);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	/**
	 * A RelationCoDomainRestriction has as single argument the class expression
	 * restricting the domain of the relation
	 */
	public Collection<ClassExpression> getComponents()
	{
		Vector<ClassExpression> components = new Vector<ClassExpression>();
		components.add(rest);
		return components;
	}
	
	@Override
	public String toRDF()
	{
		String rdf = "<" + RDFElement.RELATION_DOMAIN_REST_.toRDF() + ">\n" +
				"<" + RDFElement.CLASS.toRDF() + ">\n" +
				rest.toRDF() + 
				"\n</" + RDFElement.CLASS.toRDF() + ">\n" +
				"</" + RDFElement.RELATION_DOMAIN_REST_.toRDF() + ">\n";
		return rdf;
	}

	@Override
	public String toString()
	{
		return "Object Domain(" + rest.toString() + ")";
	}
}