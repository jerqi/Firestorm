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

package com.tencent.rss.client.util;

public class RssClientConfig {

  public static final String RSS_CLIENT_TYPE = "rss.client.type";
  public static final String RSS_CLIENT_TYPE_DEFAULT_VALUE = "GRPC";
  public static final String RSS_CLIENT_RETRY_MAX = "rss.client.retry.max";
  public static final int RSS_CLIENT_RETRY_MAX_DEFAULT_VALUE = 100;
  public static final String RSS_CLIENT_RETRY_INTERVAL_MAX = "rss.client.retry.interval.max";
  public static final long RSS_CLIENT_RETRY_INTERVAL_MAX_DEFAULT_VALUE = 10000;
  public static final String RSS_COORDINATOR_QUORUM = "rss.coordinator.quorum";
  public static final String RSS_DATA_REPLICA = "rss.data.replica";
  public static final int RSS_DATA_REPLICA_DEFAULT_VALUE = 1;
  public static final String RSS_DATA_REPLICA_WRITE = "rss.data.replica.write";
  public static final int RSS_DATA_REPLICA_WRITE_DEFAULT_VALUE = 1;
  public static final String RSS_DATA_REPLICA_READ = "rss.data.replica.read";
  public static final int RSS_DATA_REPLICA_READ_DEFAULT_VALUE = 1;
  public static final String RSS_DATA_REPLICA_SKIP_ENABLED = "rss.data.replica.skip.enabled";
  public static final boolean RSS_DATA_REPLICA_SKIP_ENABLED_DEFAULT_VALUE = true;
  public static final String RSS_HEARTBEAT_INTERVAL = "rss.heartbeat.interval";
  public static final long RSS_HEARTBEAT_INTERVAL_DEFAULT_VALUE = 10 * 1000L;
  public static final String RSS_HEARTBEAT_TIMEOUT = "rss.heartbeat.timeout";
  public static final String RSS_STORAGE_TYPE = "rss.storage.type";
  public static final String RSS_CLIENT_SEND_CHECK_INTERVAL_MS = "rss.client.send.check.interval.ms";
  public static final long RSS_CLIENT_SEND_CHECK_INTERVAL_MS_DEFAULT_VALUE = 500;
  public static final String RSS_CLIENT_SEND_CHECK_TIMEOUT_MS = "rss.client.send.check.timeout.ms";
  public static final long RSS_CLIENT_SEND_CHECK_TIMEOUT_MS_DEFAULT_VALUE = 60 * 1000 * 10;

  public static final String RSS_PARTITION_NUM_PER_RANGE = "rss.partitionNum.per.range";
  public static final int RSS_PARTITION_NUM_PER_RANGE_DEFAULT_VALUE = 1;
  public static final String RSS_REMOTE_STORAGE_PATH = "rss.remote.storage.path";
  public static final String RSS_INDEX_READ_LIMIT = "rss.index.read.limit";
  public static final int RSS_INDEX_READ_LIMIT_DEFAULT_VALUE = 500;
  public static final String RSS_CLIENT_SEND_THREAD_NUM = "rss.client.send.thread.num";
  public static final int RSS_CLIENT_DEFAULT_SEND_NUM = 5;
  public static String RSS_CLIENT_READ_BUFFER_SIZE = "rss.client.read.buffer.size";
  // When the size of read buffer reaches the half of JVM region (i.e., 32m),
  // it will incur humongous allocation, so we set it to 14m.
  public static String RSS_CLIENT_READ_BUFFER_SIZE_DEFAULT_VALUE = "14m";

  public static String RSS_ACCESS_TIMEOUT_MS = "rss.access.timeout.ms";
  public static int RSS_ACCESS_TIMEOUT_MS_DEFAULT_VALUE = 10000;
  public static final String RSS_DYNAMIC_CLIENT_CONF_ENABLED = "rss.dynamicClientConf.enabled";
  public static final boolean RSS_DYNAMIC_CLIENT_CONF_ENABLED_DEFAULT_VALUE = true;
}
