# Replace the install step in the original .bb file

do_install() {
    make DESTDIR=${D} PREFIX=/my-install-directory install
}

# We need to add the newly created directory
FILES:${PN} = "/my-install-directory"

