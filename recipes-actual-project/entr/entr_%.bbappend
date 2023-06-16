do_install() {
    make DESTDIR=${D} PREFIX=/my-install-directory install
}

FILES:${PN} = "/my-install-directory"
