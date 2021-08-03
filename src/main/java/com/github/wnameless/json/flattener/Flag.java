/*
 *
 * Copyright 2016 Wei-Ming Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package com.github.wnameless.json.flattener;

/**
 * 
 * {@link Flag} lists all acceptable flags for {@link JsonFlattener}, to change runtime behaviour.
 * 
 * @author Wei-Ming Wu
 *
 */
public enum Flag {

  /**
   * Ignores reserved characters in key and does not escape it.
   */
  IGNORE_RESERVED_CHARACTER_IN_KEY

}
