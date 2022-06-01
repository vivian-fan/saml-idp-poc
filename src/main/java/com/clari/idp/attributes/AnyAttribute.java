package com.clari.idp.attributes;

final class AnyAttribute extends AbstractAttribute {
    final Object value;

    AnyAttribute(String name, Object value) {
        super(name);
        this.value = value;
    }
}
