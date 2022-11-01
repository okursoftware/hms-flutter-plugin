/*
    Copyright 2021-2022. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License")
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0
        
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:huawei_ml_body/huawei_ml_body.dart';
import 'package:huawei_ml_body_example/screens/home.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  SystemChrome.setPreferredOrientations(
    <DeviceOrientation>[
      DeviceOrientation.portraitUp,
    ],
  );
  // TODO: Copy and paste the api_key value in your agconnect-services.json file.
  MLBodyApplication.instance.setApiKey('<api_key>');
  await requestPermissions();
  runApp(const MyApp());
}

// TODO: Please implement your own 'Permission Handler'.
Future<void> requestPermissions() async {
  // This plugin needs some permissions to work properly.
  // You are expected to handle these permissions to use this Demo.

  // You can learn more about the required permissions from our official documentations.
  // https://developer.huawei.com/consumer/en/doc/development/HMS-Plugin-Guides/assigning-permissions-0000001052789343?ha_source=hms1
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        appBarTheme: const AppBarTheme(
          elevation: 0,
          centerTitle: false,
          foregroundColor: Colors.black,
          backgroundColor: Colors.white,
        ),
      ),
      home: const Home(),
    );
  }
}
