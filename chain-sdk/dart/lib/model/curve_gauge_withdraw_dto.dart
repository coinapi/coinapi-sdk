//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CurveGaugeWithdrawDTO {
  /// Returns a new [CurveGaugeWithdrawDTO] instance.
  CurveGaugeWithdrawDTO({
    this.entryTime,
    this.recvTime,
    this.blockNumber,
    this.id,
    this.gauge,
    this.provider,
    this.value,
    this.vid,
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
  String? id;

  /// 
  String? gauge;

  /// 
  String? provider;

  /// 
  String? value;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CurveGaugeWithdrawDTO &&
     other.entryTime == entryTime &&
     other.recvTime == recvTime &&
     other.blockNumber == blockNumber &&
     other.id == id &&
     other.gauge == gauge &&
     other.provider == provider &&
     other.value == value &&
     other.vid == vid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryTime == null ? 0 : entryTime!.hashCode) +
    (recvTime == null ? 0 : recvTime!.hashCode) +
    (blockNumber == null ? 0 : blockNumber!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (gauge == null ? 0 : gauge!.hashCode) +
    (provider == null ? 0 : provider!.hashCode) +
    (value == null ? 0 : value!.hashCode) +
    (vid == null ? 0 : vid!.hashCode);

  @override
  String toString() => 'CurveGaugeWithdrawDTO[entryTime=$entryTime, recvTime=$recvTime, blockNumber=$blockNumber, id=$id, gauge=$gauge, provider=$provider, value=$value, vid=$vid]';

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
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.gauge != null) {
      json[r'gauge'] = this.gauge;
    } else {
      json[r'gauge'] = null;
    }
    if (this.provider != null) {
      json[r'provider'] = this.provider;
    } else {
      json[r'provider'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.vid != null) {
      json[r'vid'] = this.vid;
    } else {
      json[r'vid'] = null;
    }
    return json;
  }

  /// Returns a new [CurveGaugeWithdrawDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CurveGaugeWithdrawDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CurveGaugeWithdrawDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CurveGaugeWithdrawDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CurveGaugeWithdrawDTO(
        entryTime: mapDateTime(json, r'entry_time', ''),
        recvTime: mapDateTime(json, r'recv_time', ''),
        blockNumber: mapValueOfType<int>(json, r'block_number'),
        id: mapValueOfType<String>(json, r'id'),
        gauge: mapValueOfType<String>(json, r'gauge'),
        provider: mapValueOfType<String>(json, r'provider'),
        value: mapValueOfType<String>(json, r'value'),
        vid: mapValueOfType<int>(json, r'vid'),
      );
    }
    return null;
  }

  static List<CurveGaugeWithdrawDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CurveGaugeWithdrawDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CurveGaugeWithdrawDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CurveGaugeWithdrawDTO> mapFromJson(dynamic json) {
    final map = <String, CurveGaugeWithdrawDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CurveGaugeWithdrawDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CurveGaugeWithdrawDTO-objects as value to a dart map
  static Map<String, List<CurveGaugeWithdrawDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CurveGaugeWithdrawDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CurveGaugeWithdrawDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

