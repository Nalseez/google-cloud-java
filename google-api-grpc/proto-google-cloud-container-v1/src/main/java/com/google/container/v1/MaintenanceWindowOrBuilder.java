// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface MaintenanceWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   */
  boolean hasDailyMaintenanceWindow();
  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   */
  com.google.container.v1.DailyMaintenanceWindow getDailyMaintenanceWindow();
  /**
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   */
  com.google.container.v1.DailyMaintenanceWindowOrBuilder getDailyMaintenanceWindowOrBuilder();

  public com.google.container.v1.MaintenanceWindow.PolicyCase getPolicyCase();
}