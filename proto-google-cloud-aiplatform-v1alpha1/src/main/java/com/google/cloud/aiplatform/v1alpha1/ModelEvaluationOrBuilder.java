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
// source: google/cloud/aiplatform/v1alpha1/model_evaluation.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface ModelEvaluationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.ModelEvaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the ModelEvaluation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the ModelEvaluation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1alpha1.ModelEvaluation.metrics] of this ModelEvaluation. The schema is
   * defined as an OpenAPI 3.0.2 [Schema Object](
   * https:
   * //github.com/OAI/OpenAPI-Specification/b
   * // lob/master/versions/3.0.2.md#schema-object)
   * </pre>
   *
   * <code>string metrics_schema_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metricsSchemaUri.
   */
  java.lang.String getMetricsSchemaUri();
  /**
   *
   *
   * <pre>
   * Output only. Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1alpha1.ModelEvaluation.metrics] of this ModelEvaluation. The schema is
   * defined as an OpenAPI 3.0.2 [Schema Object](
   * https:
   * //github.com/OAI/OpenAPI-Specification/b
   * // lob/master/versions/3.0.2.md#schema-object)
   * </pre>
   *
   * <code>string metrics_schema_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for metricsSchemaUri.
   */
  com.google.protobuf.ByteString getMetricsSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1alpha1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1alpha1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metrics.
   */
  com.google.protobuf.Value getMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1alpha1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ValueOrBuilder getMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. All possible [dimensions][ModelEvaluationSlice.slice.dimension] of
   * ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1alpha1.ModelService.ListModelEvaluationSlices] request, in the form of
   * `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the sliceDimensions.
   */
  java.util.List<java.lang.String> getSliceDimensionsList();
  /**
   *
   *
   * <pre>
   * Output only. All possible [dimensions][ModelEvaluationSlice.slice.dimension] of
   * ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1alpha1.ModelService.ListModelEvaluationSlices] request, in the form of
   * `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of sliceDimensions.
   */
  int getSliceDimensionsCount();
  /**
   *
   *
   * <pre>
   * Output only. All possible [dimensions][ModelEvaluationSlice.slice.dimension] of
   * ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1alpha1.ModelService.ListModelEvaluationSlices] request, in the form of
   * `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The sliceDimensions at the given index.
   */
  java.lang.String getSliceDimensions(int index);
  /**
   *
   *
   * <pre>
   * Output only. All possible [dimensions][ModelEvaluationSlice.slice.dimension] of
   * ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1alpha1.ModelService.ListModelEvaluationSlices] request, in the form of
   * `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sliceDimensions at the given index.
   */
  com.google.protobuf.ByteString getSliceDimensionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated iff the Model is
   * evaluated with explanation. Currently only AutoML Tables Models have this
   * field populated.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.ModelExplanation model_explanation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the modelExplanation field is set.
   */
  boolean hasModelExplanation();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated iff the Model is
   * evaluated with explanation. Currently only AutoML Tables Models have this
   * field populated.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.ModelExplanation model_explanation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The modelExplanation.
   */
  com.google.cloud.aiplatform.v1alpha1.ModelExplanation getModelExplanation();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated iff the Model is
   * evaluated with explanation. Currently only AutoML Tables Models have this
   * field populated.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.ModelExplanation model_explanation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.ModelExplanationOrBuilder getModelExplanationOrBuilder();
}