/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1alpha1/completion_stats.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface CompletionStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.CompletionStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The number of entities that had been processed successfully.
   * </pre>
   *
   * <code>int64 successful_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The successfulCount.
   */
  long getSuccessfulCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of entities for which any error was encountered.
   * </pre>
   *
   * <code>int64 failed_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The failedCount.
   */
  long getFailedCount();

  /**
   *
   *
   * <pre>
   * Output only. In cases when enough errors are encountered a job, pipeline, or operation
   * may be failed as a whole. Below is the number of entities for which the
   * processing had not been finished (either in successful or failed state).
   * Set to -1 if the number is unknown (e.g. operation failed before total
   * entity number could had been collected).
   * </pre>
   *
   * <code>int64 incomplete_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The incompleteCount.
   */
  long getIncompleteCount();
}