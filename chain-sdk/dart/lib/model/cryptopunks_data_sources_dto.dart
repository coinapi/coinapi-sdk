//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CRYPTOPUNKSDataSourcesDTO {
  /// Returns a new [CRYPTOPUNKSDataSourcesDTO] instance.
  CRYPTOPUNKSDataSourcesDTO({
    this.entryTime,
    this.recvTime,
    this.blockNumber,
    this.vid,
    this.blockRange,
    this.causalityRegion,
    this.manifestIdx,
    this.parent,
    this.id,
    this.param,
    this.context,
    this.doneAt,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? entryTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? recvTime;

  /// Number of block in which entity was recorded.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? blockNumber;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vid;

  /// 
  String? blockRange;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? causalityRegion;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? manifestIdx;

  /// 
  int? parent;

  /// 
  String? id;

  /// 
  String? param;

  /// 
  String? context;

  /// 
  int? doneAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CRYPTOPUNKSDataSourcesDTO &&
     other.entryTime == entryTime &&
     other.recvTime == recvTime &&
     other.blockNumber == blockNumber &&
     other.vid == vid &&
     other.blockRange == blockRange &&
     other.causalityRegion == causalityRegion &&
     other.manifestIdx == manifestIdx &&
     other.parent == parent &&
     other.id == id &&
     other.param == param &&
     other.context == context &&
     other.doneAt == doneAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryTime == null ? 0 : entryTime!.hashCode) +
    (recvTime == null ? 0 : recvTime!.hashCode) +
    (blockNumber == null ? 0 : blockNumber!.hashCode) +
    (vid == null ? 0 : vid!.hashCode) +
    (blockRange == null ? 0 : blockRange!.hashCode) +
    (causalityRegion == null ? 0 : causalityRegion!.hashCode) +
    (manifestIdx == null ? 0 : manifestIdx!.hashCode) +
    (parent == null ? 0 : parent!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (param == null ? 0 : param!.hashCode) +
    (context == null ? 0 : context!.hashCode) +
    (doneAt == null ? 0 : doneAt!.hashCode);

  @override
  String toString() => 'CRYPTOPUNKSDataSourcesDTO[entryTime=$entryTime, recvTime=$recvTime, blockNumber=$blockNumber, vid=$vid, blockRange=$blockRange, causalityRegion=$causalityRegion, manifestIdx=$manifestIdx, parent=$parent, id=$id, param=$param, context=$context, doneAt=$doneAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.entryTime != null) {
      json[r'entry_time'] = this.entryTime!.toUtc().toIso8601String();
    } else {
      json[r'entry_time'] = null;
    }
    if (this.recvTime != null) {
      json[r'recv_time'] = this.recvTime!.toUtc().toIso8601String();
    } else {
      json[r'recv_time'] = null;
    }
    if (this.blockNumber != null) {
      json[r'block_number'] = this.blockNumber;
    } else {
      json[r'block_number'] = null;
    }
    if (this.vid != null) {
      json[r'vid'] = this.vid;
    } else {
      json[r'vid'] = null;
    }
    if (this.blockRange != null) {
      json[r'block_range'] = this.blockRange;
    } else {
      json[r'block_range'] = null;
    }
    if (this.causalityRegion != null) {
      json[r'causality_region'] = this.causalityRegion;
    } else {
      json[r'causality_region'] = null;
    }
    if (this.manifestIdx != null) {
      json[r'manifest_idx'] = this.manifestIdx;
    } else {
      json[r'manifest_idx'] = null;
    }
    if (this.parent != null) {
      json[r'parent'] = this.parent;
    } else {
      json[r'parent'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.param != null) {
      json[r'param'] = this.param;
    } else {
      json[r'param'] = null;
    }
    if (this.context != null) {
      json[r'context'] = this.context;
    } else {
      json[r'context'] = null;
    }
    if (this.doneAt != null) {
      json[r'done_at'] = this.doneAt;
    } else {
      json[r'done_at'] = null;
    }
    return json;
  }

  /// Returns a new [CRYPTOPUNKSDataSourcesDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CRYPTOPUNKSDataSourcesDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CRYPTOPUNKSDataSourcesDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CRYPTOPUNKSDataSourcesDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CRYPTOPUNKSDataSourcesDTO(
        entryTime: mapDateTime(json, r'entry_time', ''),
        recvTime: mapDateTime(json, r'recv_time', ''),
        blockNumber: mapValueOfType<int>(json, r'block_number'),
        vid: mapValueOfType<int>(json, r'vid'),
        blockRange: mapValueOfType<String>(json, r'block_range'),
        causalityRegion: mapValueOfType<int>(json, r'causality_region'),
        manifestIdx: mapValueOfType<int>(json, r'manifest_idx'),
        parent: mapValueOfType<int>(json, r'parent'),
        id: mapValueOfType<String>(json, r'id'),
        param: mapValueOfType<String>(json, r'param'),
        context: mapValueOfType<String>(json, r'context'),
        doneAt: mapValueOfType<int>(json, r'done_at'),
      );
    }
    return null;
  }

  static List<CRYPTOPUNKSDataSourcesDTO>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CRYPTOPUNKSDataSourcesDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CRYPTOPUNKSDataSourcesDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CRYPTOPUNKSDataSourcesDTO> mapFromJson(dynamic json) {
    final map = <String, CRYPTOPUNKSDataSourcesDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CRYPTOPUNKSDataSourcesDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CRYPTOPUNKSDataSourcesDTO-objects as value to a dart map
  static Map<String, List<CRYPTOPUNKSDataSourcesDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CRYPTOPUNKSDataSourcesDTO>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CRYPTOPUNKSDataSourcesDTO.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

