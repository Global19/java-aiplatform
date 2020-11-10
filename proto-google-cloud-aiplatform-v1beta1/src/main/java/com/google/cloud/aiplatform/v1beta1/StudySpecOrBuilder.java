// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/study.proto

package com.google.cloud.aiplatform.v1beta1;

public interface StudySpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.StudySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec> 
      getMetricsList();
  /**
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec getMetrics(int index);
  /**
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.StudySpec.MetricSpecOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec.MetricSpecOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec> 
      getParametersList();
  /**
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec getParameters(int index);
  /**
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpecOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec.ParameterSpecOrBuilder getParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The search algorithm specified for the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.StudySpec.Algorithm algorithm = 3;</code>
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   * <pre>
   * The search algorithm specified for the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.StudySpec.Algorithm algorithm = 3;</code>
   * @return The algorithm.
   */
  com.google.cloud.aiplatform.v1beta1.StudySpec.Algorithm getAlgorithm();
}
