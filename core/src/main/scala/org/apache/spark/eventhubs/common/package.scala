/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// TODO I think Structured Streaming needs this convert to a map.
// So I need to write an implicit converter for Structured Streaming.
// And need to tackle how to encode the per partition stuff. Might not be able to.
// TODO make Direct Streams just use EventHubsConf directly.

package org.apache.spark.eventhubs

package object common {
  type PartitionId = Int
  type Rate = Int
  type Offset = Long
  type EnqueueTime = Long
  type SequenceNumber = Long
}
