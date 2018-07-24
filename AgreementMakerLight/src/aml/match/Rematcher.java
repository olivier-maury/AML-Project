/******************************************************************************
 Copyright 2013-2018 LASIGE                                                  *
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
* A matching algorithm that computes similarities between mapped entities in  *
* a given Alignment and returns a new Alignment with those similarities.      *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml.match;

import aml.alignment.SimpleAlignment;
import aml.ontology.EntityType;
import aml.ontology.Ontology;

public interface Rematcher extends Matcher
{
	/**
	 * Recomputes similarities for mappings of a given Alignment
	 * @param o1: the source Ontology to match
	 * @param o2: the target Ontology to match
	 * @param a: the existing alignment
	 * @param e: the EntityType for which to recompute similarities
	 * @return the Alignment with the new similarities
	 */
	public SimpleAlignment rematch(Ontology o1, Ontology o2, SimpleAlignment a, EntityType e);
}
