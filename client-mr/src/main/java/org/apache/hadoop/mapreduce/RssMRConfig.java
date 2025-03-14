/*
 * Tencent is pleased to support the open source community by making
 * Firestorm-Spark remote shuffle server available.
 *
 * Copyright (C) 2021 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.apache.hadoop.mapreduce;

import java.util.Set;

import com.google.common.collect.Sets;

import com.tencent.rss.client.util.RssClientConfig;

public class RssMRConfig {

  public static final String MR_RSS_CONFIG_PREFIX = "mapreduce.";
  public static final String RSS_CLIENT_HEARTBEAT_THREAD_NUM =
      MR_RSS_CONFIG_PREFIX + "rss.client.heartBeat.threadNum";
  public static final int RSS_CLIENT_HEARTBEAT_THREAD_NUM_DEFAULT_VALUE = 4;
  public static final String RSS_CLIENT_TYPE = MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_TYPE;
  public static final String RSS_CLIENT_TYPE_DEFAULT_VALUE = RssClientConfig.RSS_CLIENT_TYPE_DEFAULT_VALUE;
  public static final String RSS_CLIENT_RETRY_MAX = MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_RETRY_MAX;
  public static final int RSS_CLIENT_RETRY_MAX_DEFAULT_VALUE = RssClientConfig.RSS_CLIENT_RETRY_MAX_DEFAULT_VALUE;
  public static final String RSS_CLIENT_RETRY_INTERVAL_MAX =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_RETRY_INTERVAL_MAX;
  public static final long RSS_CLIENT_RETRY_INTERVAL_MAX_DEFAULT_VALUE =
      RssClientConfig.RSS_CLIENT_RETRY_INTERVAL_MAX_DEFAULT_VALUE;
  public static final String RSS_COORDINATOR_QUORUM =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_COORDINATOR_QUORUM;
  public static final String RSS_DATA_REPLICA = MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_DATA_REPLICA;
  public static final int RSS_DATA_REPLICA_DEFAULT_VALUE = RssClientConfig.RSS_DATA_REPLICA_DEFAULT_VALUE;
  public static final String RSS_DATA_REPLICA_WRITE =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_DATA_REPLICA_WRITE;
  public static final int RSS_DATA_REPLICA_WRITE_DEFAULT_VALUE =
      RssClientConfig.RSS_DATA_REPLICA_WRITE_DEFAULT_VALUE;
  public static final String RSS_DATA_REPLICA_READ =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_DATA_REPLICA_READ;
  public static final int RSS_DATA_REPLICA_READ_DEFAULT_VALUE =
      RssClientConfig.RSS_DATA_REPLICA_READ_DEFAULT_VALUE;
  public static final String RSS_DATA_REPLICA_SKIP_ENABLED =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_DATA_REPLICA_SKIP_ENABLED;
  public static final String RSS_CLIENT_SEND_THREAD_NUM =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_SEND_THREAD_NUM;
  public static final int RSS_CLIENT_DEFAULT_SEND_THREAD_NUM =
      RssClientConfig.RSS_CLIENT_DEFAULT_SEND_NUM;
  public static final String RSS_CLIENT_SEND_THRESHOLD = MR_RSS_CONFIG_PREFIX + "rss.client.send.threshold";
  public static final double RSS_CLIENT_DEFAULT_SEND_THRESHOLD = 0.2f;
  public static boolean RSS_DATA_REPLICA_SKIP_ENABLED_DEFAULT_VALUE =
      RssClientConfig.RSS_DATA_REPLICA_SKIP_ENABLED_DEFAULT_VALUE;
  public static final String RSS_HEARTBEAT_INTERVAL =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_HEARTBEAT_INTERVAL;
  public static final long RSS_HEARTBEAT_INTERVAL_DEFAULT_VALUE =
      RssClientConfig.RSS_HEARTBEAT_INTERVAL_DEFAULT_VALUE;
  public static final String RSS_HEARTBEAT_TIMEOUT =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_HEARTBEAT_TIMEOUT;
  public static final String RSS_ASSIGNMENT_PREFIX = MR_RSS_CONFIG_PREFIX + "rss.assignment.partition.";
  public static final String RSS_CLIENT_BATCH_TRIGGER_NUM =
      MR_RSS_CONFIG_PREFIX + "rss.client.batch.trigger.num";
  public static final int RSS_CLIENT_DEFAULT_BATCH_TRIGGER_NUM = 50;
  public static final String RSS_CLIENT_MEMORY_THRESHOLD =
      MR_RSS_CONFIG_PREFIX + "rss.client.memory.threshold";
  public static final double RSS_CLIENT_DEFAULT_MEMORY_THRESHOLD = 0.8f;
  public static final String RSS_CLIENT_SEND_CHECK_INTERVAL_MS =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_SEND_CHECK_INTERVAL_MS;
  public static final long RSS_CLIENT_SEND_CHECK_INTERVAL_MS_DEFAULT_VALUE =
      RssClientConfig.RSS_CLIENT_SEND_CHECK_INTERVAL_MS_DEFAULT_VALUE;
  public static final String RSS_CLIENT_SEND_CHECK_TIMEOUT_MS =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_SEND_CHECK_TIMEOUT_MS;
  public static final long RSS_CLIENT_SEND_CHECK_TIMEOUT_MS_DEFAULT_VALUE =
      RssClientConfig.RSS_CLIENT_SEND_CHECK_TIMEOUT_MS_DEFAULT_VALUE;
  public static final String RSS_CLIENT_BITMAP_NUM = MR_RSS_CONFIG_PREFIX + "rss.client.bitmap.num";
  public static final int RSS_CLIENT_DEFAULT_BITMAP_NUM = 1;
  public static final String RSS_CLIENT_MAX_SEGMENT_SIZE =
      MR_RSS_CONFIG_PREFIX + "rss.client.max.buffer.size";
  public static final long RSS_CLIENT_DEFAULT_MAX_SEGMENT_SIZE = 3 * 1024;
  public static final String RSS_STORAGE_TYPE = MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_STORAGE_TYPE;

  public static final String RSS_PARTITION_NUM_PER_RANGE =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_PARTITION_NUM_PER_RANGE;
  public static final int RSS_PARTITION_NUM_PER_RANGE_DEFAULT_VALUE =
      RssClientConfig.RSS_PARTITION_NUM_PER_RANGE_DEFAULT_VALUE;
  public static final String RSS_REMOTE_STORAGE_PATH =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_REMOTE_STORAGE_PATH;
  public static final String RSS_REMOTE_STORAGE_CONF =
      MR_RSS_CONFIG_PREFIX + "rss.remote.storage.conf";
  public static final String RSS_INDEX_READ_LIMIT =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_INDEX_READ_LIMIT;
  public static final int RSS_INDEX_READ_LIMIT_DEFAULT_VALUE =
      RssClientConfig.RSS_INDEX_READ_LIMIT_DEFAULT_VALUE;
  public static String RSS_CLIENT_READ_BUFFER_SIZE =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_CLIENT_READ_BUFFER_SIZE;

  // When the size of read buffer reaches the half of JVM region (i.e., 32m),
  // it will incur humongous allocation, so we set it to 14m.
  public static String RSS_CLIENT_READ_BUFFER_SIZE_DEFAULT_VALUE =
      RssClientConfig.RSS_CLIENT_READ_BUFFER_SIZE_DEFAULT_VALUE;

  public static String RSS_DYNAMIC_CLIENT_CONF_ENABLED =
      MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_DYNAMIC_CLIENT_CONF_ENABLED;
  public static boolean RSS_DYNAMIC_CLIENT_CONF_ENABLED_DEFAULT_VALUE =
      RssClientConfig.RSS_DYNAMIC_CLIENT_CONF_ENABLED_DEFAULT_VALUE;
  public static String RSS_ACCESS_TIMEOUT_MS = MR_RSS_CONFIG_PREFIX + RssClientConfig.RSS_ACCESS_TIMEOUT_MS;
  public static int RSS_ACCESS_TIMEOUT_MS_DEFAULT_VALUE = RssClientConfig.RSS_ACCESS_TIMEOUT_MS_DEFAULT_VALUE;

  public static Set<String> RSS_MANDATORY_CLUSTER_CONF = Sets.newHashSet(
      RSS_STORAGE_TYPE, RSS_REMOTE_STORAGE_PATH);
}
