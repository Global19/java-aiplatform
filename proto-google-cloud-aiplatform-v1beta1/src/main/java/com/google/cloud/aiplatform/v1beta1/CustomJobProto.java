// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class CustomJobProto {
  private CustomJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Scheduling_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1beta1/custom" +
      "_job.proto\022\037google.cloud.aiplatform.v1be" +
      "ta1\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032-google/cloud/ai" +
      "platform/v1beta1/env_var.proto\032(google/c" +
      "loud/aiplatform/v1beta1/io.proto\032/google" +
      "/cloud/aiplatform/v1beta1/job_state.prot" +
      "o\0327google/cloud/aiplatform/v1beta1/machi" +
      "ne_resources.proto\032\036google/protobuf/dura" +
      "tion.proto\032\037google/protobuf/timestamp.pr" +
      "oto\032\027google/rpc/status.proto\032\034google/api" +
      "/annotations.proto\"\235\005\n\tCustomJob\022\021\n\004name" +
      "\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022E" +
      "\n\010job_spec\030\004 \001(\0132..google.cloud.aiplatfo" +
      "rm.v1beta1.CustomJobSpecB\003\340A\002\022=\n\005state\030\005" +
      " \001(\0162).google.cloud.aiplatform.v1beta1.J" +
      "obStateB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\003\340A\003\0223\n\nstart_time" +
      "\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "1\n\010end_time\030\010 \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\0224\n\013update_time\030\t \001(\0132\032.google" +
      ".protobuf.TimestampB\003\340A\003\022&\n\005error\030\n \001(\0132" +
      "\022.google.rpc.StatusB\003\340A\003\022F\n\006labels\030\013 \003(\013" +
      "26.google.cloud.aiplatform.v1beta1.Custo" +
      "mJob.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:i\352Af\n#aiplatform" +
      ".googleapis.com/CustomJob\022?projects/{pro" +
      "ject}/locations/{location}/customJobs/{c" +
      "ustom_job}\"\233\002\n\rCustomJobSpec\022O\n\021worker_p" +
      "ool_specs\030\001 \003(\0132/.google.cloud.aiplatfor" +
      "m.v1beta1.WorkerPoolSpecB\003\340A\002\022?\n\nschedul" +
      "ing\030\003 \001(\0132+.google.cloud.aiplatform.v1be" +
      "ta1.Scheduling\022\027\n\017service_account\030\004 \001(\t\022" +
      "\017\n\007network\030\005 \001(\t\022N\n\025base_output_director" +
      "y\030\006 \001(\0132/.google.cloud.aiplatform.v1beta" +
      "1.GcsDestination\"\333\002\n\016WorkerPoolSpec\022H\n\016c" +
      "ontainer_spec\030\006 \001(\0132..google.cloud.aipla" +
      "tform.v1beta1.ContainerSpecH\000\022Q\n\023python_" +
      "package_spec\030\007 \001(\01322.google.cloud.aiplat" +
      "form.v1beta1.PythonPackageSpecH\000\022J\n\014mach" +
      "ine_spec\030\001 \001(\0132,.google.cloud.aiplatform" +
      ".v1beta1.MachineSpecB\006\340A\002\340A\005\022\032\n\rreplica_" +
      "count\030\002 \001(\003B\003\340A\002\022<\n\tdisk_spec\030\005 \001(\0132).go" +
      "ogle.cloud.aiplatform.v1beta1.DiskSpecB\006" +
      "\n\004task\"F\n\rContainerSpec\022\026\n\timage_uri\030\001 \001" +
      "(\tB\003\340A\002\022\017\n\007command\030\002 \003(\t\022\014\n\004args\030\003 \003(\t\"y" +
      "\n\021PythonPackageSpec\022\037\n\022executor_image_ur" +
      "i\030\001 \001(\tB\003\340A\002\022\031\n\014package_uris\030\002 \003(\tB\003\340A\002\022" +
      "\032\n\rpython_module\030\003 \001(\tB\003\340A\002\022\014\n\004args\030\004 \003(" +
      "\t\"_\n\nScheduling\022*\n\007timeout\030\001 \001(\0132\031.googl" +
      "e.protobuf.Duration\022%\n\035restart_job_on_wo" +
      "rker_restart\030\003 \001(\010B\202\001\n#com.google.cloud." +
      "aiplatform.v1beta1B\016CustomJobProtoP\001ZIgo" +
      "ogle.golang.org/genproto/googleapis/clou" +
      "d/aiplatform/v1beta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "JobSpec", "State", "CreateTime", "StartTime", "EndTime", "UpdateTime", "Error", "Labels", });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor,
        new java.lang.String[] { "WorkerPoolSpecs", "Scheduling", "ServiceAccount", "Network", "BaseOutputDirectory", });
    internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor,
        new java.lang.String[] { "ContainerSpec", "PythonPackageSpec", "MachineSpec", "ReplicaCount", "DiskSpec", "Task", });
    internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor,
        new java.lang.String[] { "ImageUri", "Command", "Args", });
    internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor,
        new java.lang.String[] { "ExecutorImageUri", "PackageUris", "PythonModule", "Args", });
    internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_Scheduling_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor,
        new java.lang.String[] { "Timeout", "RestartJobOnWorkerRestart", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
