load(
    "@rules_intellij//build_defs:build_defs.bzl",
    "intellij_plugin",
    "intellij_plugin_library",
    "stamped_plugin_xml",
    "repackaged_files",
    "plugin_deploy_zip",
)
load(
    "@rules_intellij//intellij_platform_sdk:build_defs.bzl",
    "select_for_ide",
    "select_from_plugin_api_directory",
)
load(
    "@rules_intellij//build_defs:intellij_plugin_debug_target.bzl",
    "intellij_plugin_debug_target",
)

load("@rules_kotlin//kotlin:core.bzl", "define_kt_toolchain")

define_kt_toolchain(
    name = "kotlin_toolchain",
    api_version = "1.9",  # "1.1", "1.2", "1.3", "1.4", "1.5" "1.6", "1.7", "1.8", or "1.9"
    jvm_target = "17", # "1.6", "1.8", "9", "10", "11", "12", "13", "15", "16", "17", "18", "19", "20" or "21"
    language_version = "1.9",  # "1.1", "1.2", "1.3", "1.4", "1.5" "1.6", "1.7", "1.8", or "1.9"
)

intellij_plugin_library(
    name = "plugin_library",
    optional_plugin_deps = [],
#    plugin_deps = ["com.intellij.modules.platform"],
    plugin_xmls = [
        "//src:main/resources/META-INF/base.xml"
        ],
    visibility = ["//visibility:public"],
    deps = [
        "//src:plugin",
    ],
)

VERSION = "666"

stamped_plugin_xml(
    name = "stamped_plugin_xml",
    plugin_id = "org.jetbrains.bazel",
    plugin_name = "Bazel (experimental)",
    version = VERSION,
)

intellij_plugin(
    name = "intellij_bazel",
    plugin_xml = ":stamped_plugin_xml",
    plugin_deps = ["org.jetbrains.bsp"],
    deps = [
        ":plugin_library",
    ],
    visibility = ["//visibility:public"],
)

intellij_plugin(
    name = "intellij_bazel_merged",
    plugin_xml = ":stamped_plugin_xml",
    deps = [
        "@intellij-bsp//:plugin_library",
        ":plugin_library",
    ],
)

intellij_plugin_debug_target(
    name = "ijwb_bazel_dev",
    deps = [
        ":intellij_bazel_merged",
    ],
)

repackaged_files(
    name = "plugin_jar",
    srcs = [":intellij_bazel"],
    prefix = "ijwb/lib",
)

plugin_deploy_zip(
    name = "plugin_zip",
    srcs = [
        ":plugin_jar",
    ],
    zip_filename = "plugin.zip",
    visibility = ["//visibility:public"],
)