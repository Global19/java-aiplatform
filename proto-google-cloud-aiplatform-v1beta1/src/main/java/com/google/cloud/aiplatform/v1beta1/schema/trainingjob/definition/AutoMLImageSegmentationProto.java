// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLImageSegmentationProto {
  private AutoMLImageSegmentationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n]google/cloud/aiplatform/v1beta1/schema" +
      "/trainingjob/definition/automl_image_seg" +
      "mentation.proto\022=google.cloud.aiplatform" +
      ".v1beta1.schema.trainingjob.definition\032\034" +
      "google/api/annotations.proto\"\371\001\n\027AutoMlI" +
      "mageSegmentation\022l\n\006inputs\030\001 \001(\0132\\.googl" +
      "e.cloud.aiplatform.v1beta1.schema.traini" +
      "ngjob.definition.AutoMlImageSegmentation" +
      "Inputs\022p\n\010metadata\030\002 \001(\0132^.google.cloud." +
      "aiplatform.v1beta1.schema.trainingjob.de" +
      "finition.AutoMlImageSegmentationMetadata" +
      "\"\261\002\n\035AutoMlImageSegmentationInputs\022z\n\nmo" +
      "del_type\030\001 \001(\0162f.google.cloud.aiplatform" +
      ".v1beta1.schema.trainingjob.definition.A" +
      "utoMlImageSegmentationInputs.ModelType\022\037" +
      "\n\027budget_milli_node_hours\030\002 \001(\003\022\025\n\rbase_" +
      "model_id\030\003 \001(\t\"\\\n\tModelType\022\032\n\026MODEL_TYP" +
      "E_UNSPECIFIED\020\000\022\031\n\025CLOUD_HIGH_ACCURACY_1" +
      "\020\001\022\030\n\024CLOUD_LOW_ACCURACY_1\020\002\"\277\002\n\037AutoMlI" +
      "mageSegmentationMetadata\022\035\n\025cost_milli_n" +
      "ode_hours\030\001 \001(\003\022\223\001\n\026successful_stop_reas" +
      "on\030\002 \001(\0162s.google.cloud.aiplatform.v1bet" +
      "a1.schema.trainingjob.definition.AutoMlI" +
      "mageSegmentationMetadata.SuccessfulStopR" +
      "eason\"g\n\024SuccessfulStopReason\022&\n\"SUCCESS" +
      "FUL_STOP_REASON_UNSPECIFIED\020\000\022\022\n\016BUDGET_" +
      "REACHED\020\001\022\023\n\017MODEL_CONVERGED\020\002B\314\001\nAcom.g" +
      "oogle.cloud.aiplatform.v1beta1.schema.tr" +
      "ainingjob.definitionB\034AutoMLImageSegment" +
      "ationProtoP\001Zggoogle.golang.org/genproto" +
      "/googleapis/cloud/aiplatform/v1beta1/sch" +
      "ema/trainingjob/definition;definitionb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor,
        new java.lang.String[] { "Inputs", "Metadata", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor,
        new java.lang.String[] { "ModelType", "BudgetMilliNodeHours", "BaseModelId", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor,
        new java.lang.String[] { "CostMilliNodeHours", "SuccessfulStopReason", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
