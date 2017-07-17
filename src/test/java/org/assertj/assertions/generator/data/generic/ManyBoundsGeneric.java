/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2017 the original author or authors.
 */
package org.assertj.assertions.generator.data.generic;

import java.util.Map;

public class ManyBoundsGeneric<T extends Exception & Comparable<T>> {

  public Map<T, MyGeneric<T>>[] genericArray = null;

  public <T extends Exception, V extends String> Map<T, V> getValue(V name, Class<T> type) {
    return null;
  }

}