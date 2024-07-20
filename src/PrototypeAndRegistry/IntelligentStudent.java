package PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent Copy() {
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }
}
