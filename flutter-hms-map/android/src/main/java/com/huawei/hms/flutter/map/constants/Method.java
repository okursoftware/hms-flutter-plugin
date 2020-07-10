/*
Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.flutter.map.constants;

public interface Method {
    String CAMERA_ON_MOVE_STARTED = "[Camera]onMoveStarted";
    String CAMERA_ON_MOVE = "[Camera]onMove";
    String CAMERA_ON_IDLE = "[Camera]onIdle";
    String MARKER_CLICK = "[Marker]click";
    String MARKER_ON_DRAG_END = "[Marker]onDragEnd";
    String INFO_WINDOW_CLICK = "[InfoWindow]click";
    String POLYLINE_CLICK = "[Polyline]click";
    String POLYGON_CLICK = "[Polygon]click";
    String CIRCLE_CLICK = "[Circle]click";
    String MAP_CLICK = "[Map]click";
    String MAP_ON_LONG_PRESS = "[Map]onLongPress";
    String MAP_WAIT_FOR_MAP = "[Map]waitForMap";
    String MAP_UPDATE = "[Map]update";
    String MAP_GET_VISIBLE_REGION = "[Map]getVisibleRegion";
    String MAP_GET_SCREEN_COORDINATE = "[Map]getScreenCoordinate";
    String MAP_GET_LAT_LNG = "[Map]getLatLng";
    String MAP_TAKE_SNAPSHOT = "[Map]takeSnapshot";
    String CAMERA_MOVE = "[Camera]move";
    String CAMERA_ANIMATE = "[Camera]animate";
    String MARKERS_UPDATE = "[Markers]update";
    String MARKERS_SHOW_INFO_WINDOW = "[Markers]showInfoWindow";
    String MARKERS_HIDE_INFO_WINDOW = "[Markers]hideInfoWindow";
    String MARKERS_IS_INFO_WINDOW_SHOWN = "[Markers]isInfoWindowShown";
    String POLYGONS_UPDATE = "[Polygons]update";
    String POLYLINES_UPDATE = "[Polylines]update";
    String CIRCLES_UPDATE = "[Circles]update";
    String MAP_IS_COMPASS_ENABLED = "[Map]isCompassEnabled";
    String MAP_IS_MAP_TOOLBAR_ENABLED = "[Map]isMapToolbarEnabled";
    String MAP_GET_MIN_MAX_ZOOM_LEVELS = "[Map]getMinMaxZoomLevels";
    String MAP_IS_ZOOM_GESTURES_ENABLED = "[Map]isZoomGesturesEnabled";
    String MAP_IS_ZOOM_CONTROLS_ENABLED = "[Map]isZoomControlsEnabled";
    String MAP_IS_SCROLL_GESTURES_ENABLED = "[Map]isScrollGesturesEnabled";
    String MAP_IS_TILT_GESTURES_ENABLED = "[Map]isTiltGesturesEnabled";
    String MAP_IS_ROTATE_GESTURES_ENABLED = "[Map]isRotateGesturesEnabled";
    String MAP_IS_MY_LOCATION_BUTTON_ENABLED = "[Map]isMyLocationButtonEnabled";
    String MAP_IS_TRAFFIC_ENABLED = "[Map]isTrafficEnabled";
    String MAP_IS_BUILDINGS_ENABLED = "[Map]isBuildingsEnabled";
    String MAP_GET_ZOOM_LEVEL = "[Map]getZoomLevel";
    String MAP_SET_STYLE = "[Map]setStyle";
}
