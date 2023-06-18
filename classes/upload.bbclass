MY_UPLOAD_DIR = "my-upload-dir"

do_install:append () {
    mkdir -p /tmp/${MY_UPLOAD_DIR}
    find ${D} -type f -name "*.1"
    cp -r $(find ${D} -type f -name "*.1") /tmp/${MY_UPLOAD_DIR}/
    # Implement actual upload from here
}
