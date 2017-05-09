/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.core.file.blockfile.cache.lru;

import org.apache.accumulo.core.conf.AccumuloConfiguration;
import org.apache.accumulo.core.file.blockfile.cache.BlockCacheFactory;
import org.apache.accumulo.core.file.blockfile.cache.CacheType;

public class LruBlockCacheFactory extends BlockCacheFactory<LruBlockCache,LruBlockCacheConfiguration> {

  @Override
  protected LruBlockCacheConfiguration createConfiguration(AccumuloConfiguration conf, CacheType type,
      BlockCacheFactory<LruBlockCache,LruBlockCacheConfiguration> factory) {
    return new LruBlockCacheConfiguration(conf, type, factory);
  }

  @Override
  protected LruBlockCache createCache(LruBlockCacheConfiguration conf) {
    return new LruBlockCache(conf);
  }

  @Override
  public String getCacheImplName() {
    return "lru";
  }

  @Override
  public void stop() {}

}
