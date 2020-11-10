// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DedicatedResourcesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DedicatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   * <pre>
   * Required. Immutable. The minimum number of machine replicas this DeployedModel will be always
   * deployed on. If traffic against it increases, it may dynamically be
   * deployed onto more replicas, and as traffic decreases, some of these extra
   * replicas may be freed.
   * Note: if [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count] is
   * above 0, currently the model will be always deployed precisely on
   * [min_replica_count][google.cloud.aiplatform.v1beta1.DedicatedResources.min_replica_count].
   * </pre>
   *
   * <code>int32 min_replica_count = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The minReplicaCount.
   */
  int getMinReplicaCount();

  /**
   * <pre>
   * Immutable. The maximum number of replicas this DeployedModel may be deployed on when
   * the traffic against it increases. If requested value is too large,
   * the deployment will error, but if deployment succeeds then the ability
   * to scale the model to that many replicas is guaranteed (barring service
   * outages). If traffic against the DeployedModel increases beyond what its
   * replicas at maximum may handle, a portion of the traffic will be dropped.
   * If this value is not provided, will use [min_replica_count][google.cloud.aiplatform.v1beta1.DedicatedResources.min_replica_count] as the
   * default value.
   * </pre>
   *
   * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The maxReplicaCount.
   */
  int getMaxReplicaCount();
}
