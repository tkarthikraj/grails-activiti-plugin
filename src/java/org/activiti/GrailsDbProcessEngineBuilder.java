/* Copyright 2006-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti;

import java.util.Properties;
import org.activiti.engine.ProcessEngineBuilder;
/**
 *
 *  This class is created to fix org.springframework.beans.NotWritablePropertyException: 
 *  Invalid property 'jobExecutorAutoActivation' of bean class [org.activiti.DbProcessEngineBuilder]
  *
 * @author <a href='mailto:limcheekin@vobject.com'>Lim Chee Kin</a>
 *
 * @since 5.0.alpha3
 */
public class GrailsDbProcessEngineBuilder {
	public static ProcessEngineBuilder getInstance(Properties configurationProperties) {
	    return new ProcessEngineBuilder().configureFromProperties(configurationProperties);
	  }
}