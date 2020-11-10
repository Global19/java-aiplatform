// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DataLabelingJobProto {
  private DataLabelingJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/data_l" +
      "abeling_job.proto\022\037google.cloud.aiplatfo" +
      "rm.v1beta1\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\0326google/c" +
      "loud/aiplatform/v1beta1/accelerator_type" +
      ".proto\032/google/cloud/aiplatform/v1beta1/" +
      "job_state.proto\0325google/cloud/aiplatform" +
      "/v1beta1/specialist_pool.proto\032\034google/p" +
      "rotobuf/struct.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032\027google/rpc/status.proto\032\027" +
      "google/type/money.proto\032\034google/api/anno" +
      "tations.proto\"\256\010\n\017DataLabelingJob\022\021\n\004nam" +
      "e\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022" +
      ";\n\010datasets\030\003 \003(\tB)\340A\002\372A#\n!aiplatform.go" +
      "ogleapis.com/Dataset\022a\n\021annotation_label" +
      "s\030\014 \003(\0132F.google.cloud.aiplatform.v1beta" +
      "1.DataLabelingJob.AnnotationLabelsEntry\022" +
      "\032\n\rlabeler_count\030\004 \001(\005B\003\340A\002\022\034\n\017instructi" +
      "on_uri\030\005 \001(\tB\003\340A\002\022\036\n\021inputs_schema_uri\030\006" +
      " \001(\tB\003\340A\002\022+\n\006inputs\030\007 \001(\0132\026.google.proto" +
      "buf.ValueB\003\340A\002\022=\n\005state\030\010 \001(\0162).google.c" +
      "loud.aiplatform.v1beta1.JobStateB\003\340A\003\022\036\n" +
      "\021labeling_progress\030\r \001(\005B\003\340A\003\022.\n\rcurrent" +
      "_spend\030\016 \001(\0132\022.google.type.MoneyB\003\340A\003\0224\n" +
      "\013create_time\030\t \001(\0132\032.google.protobuf.Tim" +
      "estampB\003\340A\003\0224\n\013update_time\030\n \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\022&\n\005error\030\026 \001(\013" +
      "2\022.google.rpc.StatusB\003\340A\003\022L\n\006labels\030\013 \003(" +
      "\0132<.google.cloud.aiplatform.v1beta1.Data" +
      "LabelingJob.LabelsEntry\022\030\n\020specialist_po" +
      "ols\030\020 \003(\t\022U\n\026active_learning_config\030\025 \001(" +
      "\01325.google.cloud.aiplatform.v1beta1.Acti" +
      "veLearningConfig\0327\n\025AnnotationLabelsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032-\n\013Lab" +
      "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      ":|\352Ay\n)aiplatform.googleapis.com/DataLab" +
      "elingJob\022Lprojects/{project}/locations/{" +
      "location}/dataLabelingJobs/{data_labelin" +
      "g_job}\"\202\002\n\024ActiveLearningConfig\022\035\n\023max_d" +
      "ata_item_count\030\001 \001(\003H\000\022\"\n\030max_data_item_" +
      "percentage\030\002 \001(\005H\000\022D\n\rsample_config\030\003 \001(" +
      "\0132-.google.cloud.aiplatform.v1beta1.Samp" +
      "leConfig\022H\n\017training_config\030\004 \001(\0132/.goog" +
      "le.cloud.aiplatform.v1beta1.TrainingConf" +
      "igB\027\n\025human_labeling_budget\"\275\002\n\014SampleCo" +
      "nfig\022)\n\037initial_batch_sample_percentage\030" +
      "\001 \001(\005H\000\022+\n!following_batch_sample_percen" +
      "tage\030\003 \001(\005H\001\022U\n\017sample_strategy\030\005 \001(\0162<." +
      "google.cloud.aiplatform.v1beta1.SampleCo" +
      "nfig.SampleStrategy\"B\n\016SampleStrategy\022\037\n" +
      "\033SAMPLE_STRATEGY_UNSPECIFIED\020\000\022\017\n\013UNCERT" +
      "AINTY\020\001B\033\n\031initial_batch_sample_sizeB\035\n\033" +
      "following_batch_sample_size\"6\n\016TrainingC" +
      "onfig\022$\n\034timeout_training_milli_hours\030\001 " +
      "\001(\003B\210\001\n#com.google.cloud.aiplatform.v1be" +
      "ta1B\024DataLabelingJobProtoP\001ZIgoogle.gola" +
      "ng.org/genproto/googleapis/cloud/aiplatf" +
      "orm/v1beta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.MoneyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Datasets", "AnnotationLabels", "LabelerCount", "InstructionUri", "InputsSchemaUri", "Inputs", "State", "LabelingProgress", "CurrentSpend", "CreateTime", "UpdateTime", "Error", "Labels", "SpecialistPools", "ActiveLearningConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor,
        new java.lang.String[] { "MaxDataItemCount", "MaxDataItemPercentage", "SampleConfig", "TrainingConfig", "HumanLabelingBudget", });
    internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor,
        new java.lang.String[] { "InitialBatchSamplePercentage", "FollowingBatchSamplePercentage", "SampleStrategy", "InitialBatchSampleSize", "FollowingBatchSampleSize", });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor,
        new java.lang.String[] { "TimeoutTrainingMilliHours", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
