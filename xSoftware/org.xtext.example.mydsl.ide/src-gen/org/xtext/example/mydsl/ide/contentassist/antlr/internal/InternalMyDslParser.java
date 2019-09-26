package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'response.status'", "'response'", "'true'", "'false'", "'string'", "'int'", "'boolean'", "'=='", "'>'", "'<'", "'>='", "'<='", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'apiURL'", "'SimpleEntity'", "'{'", "'}'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'URL'", "'/'", "'?'", "'${'", "'/:{'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'description'", "'Assertions'", "'Mapping'", "'{parameter'", "','", "'value'", "'request->'", "'response->'", "'parameter.'", "'.'", "'PK,mockType'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_EQUAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=8;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:53:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleApi EOF )
            // InternalMyDsl.g:55:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:62:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Api__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Api__Group__0 )
            // InternalMyDsl.g:69:4: rule__Api__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleEntidad"
    // InternalMyDsl.g:78:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntidad EOF )
            // InternalMyDsl.g:80:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalMyDsl.g:87:1: ruleEntidad : ( ( rule__Entidad__Alternatives ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entidad__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Entidad__Alternatives )
            {
             before(grammarAccess.getEntidadAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Entidad__Alternatives )
            // InternalMyDsl.g:94:4: rule__Entidad__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:103:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:105:1: ruleSimpleEntity EOF
            {
             before(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleEntity();

            state._fsp--;

             after(grammarAccess.getSimpleEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalMyDsl.g:112:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:119:4: rule__SimpleEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:128:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAtributo EOF )
            // InternalMyDsl.g:130:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:137:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Atributo__Alternatives )
            // InternalMyDsl.g:144:4: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:153:1: entryRuleAtributoMocka : ruleAtributoMocka EOF ;
    public final void entryRuleAtributoMocka() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAtributoMocka EOF )
            // InternalMyDsl.g:155:1: ruleAtributoMocka EOF
            {
             before(grammarAccess.getAtributoMockaRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoMocka();

            state._fsp--;

             after(grammarAccess.getAtributoMockaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoMocka"


    // $ANTLR start "ruleAtributoMocka"
    // InternalMyDsl.g:162:1: ruleAtributoMocka : ( ( rule__AtributoMocka__Group__0 ) ) ;
    public final void ruleAtributoMocka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__AtributoMocka__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__AtributoMocka__Group__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__AtributoMocka__Group__0 )
            // InternalMyDsl.g:169:4: rule__AtributoMocka__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoMocka"


    // $ANTLR start "entryRuleAtributoArreglo"
    // InternalMyDsl.g:178:1: entryRuleAtributoArreglo : ruleAtributoArreglo EOF ;
    public final void entryRuleAtributoArreglo() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtributoArreglo EOF )
            // InternalMyDsl.g:180:1: ruleAtributoArreglo EOF
            {
             before(grammarAccess.getAtributoArregloRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoArreglo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoArreglo"


    // $ANTLR start "ruleAtributoArreglo"
    // InternalMyDsl.g:187:1: ruleAtributoArreglo : ( ( rule__AtributoArreglo__Group__0 ) ) ;
    public final void ruleAtributoArreglo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtributoArreglo__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtributoArreglo__Group__0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtributoArreglo__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtributoArreglo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoArreglo"


    // $ANTLR start "entryRuleAtributoSimple"
    // InternalMyDsl.g:203:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAtributoSimple EOF )
            // InternalMyDsl.g:205:1: ruleAtributoSimple EOF
            {
             before(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // InternalMyDsl.g:212:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AtributoSimple__Group__0 )
            // InternalMyDsl.g:219:4: rule__AtributoSimple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:228:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMyString EOF )
            // InternalMyDsl.g:230:1: ruleMyString EOF
            {
             before(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            ruleMyString();

            state._fsp--;

             after(grammarAccess.getMyStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalMyDsl.g:237:1: ruleMyString : ( ( rule__MyString__NameAssignment ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__MyString__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__MyString__NameAssignment )
            {
             before(grammarAccess.getMyStringAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__MyString__NameAssignment )
            // InternalMyDsl.g:244:4: rule__MyString__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyString__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:253:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:255:1: ruleMyNumeric EOF
            {
             before(grammarAccess.getMyNumericRule()); 
            pushFollow(FOLLOW_1);
            ruleMyNumeric();

            state._fsp--;

             after(grammarAccess.getMyNumericRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyNumeric"


    // $ANTLR start "ruleMyNumeric"
    // InternalMyDsl.g:262:1: ruleMyNumeric : ( ( rule__MyNumeric__NameAssignment ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__MyNumeric__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__MyNumeric__NameAssignment )
            {
             before(grammarAccess.getMyNumericAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__MyNumeric__NameAssignment )
            // InternalMyDsl.g:269:4: rule__MyNumeric__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:278:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:280:1: ruleMyBoolean EOF
            {
             before(grammarAccess.getMyBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyBoolean"


    // $ANTLR start "ruleMyBoolean"
    // InternalMyDsl.g:287:1: ruleMyBoolean : ( ( rule__MyBoolean__NameAssignment ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MyBoolean__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__MyBoolean__NameAssignment )
            {
             before(grammarAccess.getMyBooleanAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__MyBoolean__NameAssignment )
            // InternalMyDsl.g:294:4: rule__MyBoolean__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:303:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:305:1: ruleMockarooEntity EOF
            {
             before(grammarAccess.getMockarooEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleMockarooEntity();

            state._fsp--;

             after(grammarAccess.getMockarooEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMockarooEntity"


    // $ANTLR start "ruleMockarooEntity"
    // InternalMyDsl.g:312:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:319:4: rule__MockarooEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockarooEntity"


    // $ANTLR start "entryRuleServicioRest"
    // InternalMyDsl.g:328:1: entryRuleServicioRest : ruleServicioRest EOF ;
    public final void entryRuleServicioRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleServicioRest EOF )
            // InternalMyDsl.g:330:1: ruleServicioRest EOF
            {
             before(grammarAccess.getServicioRestRule()); 
            pushFollow(FOLLOW_1);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getServicioRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServicioRest"


    // $ANTLR start "ruleServicioRest"
    // InternalMyDsl.g:337:1: ruleServicioRest : ( ( rule__ServicioRest__Group__0 ) ) ;
    public final void ruleServicioRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ServicioRest__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ServicioRest__Group__0 )
            {
             before(grammarAccess.getServicioRestAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ServicioRest__Group__0 )
            // InternalMyDsl.g:344:4: rule__ServicioRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServicioRest"


    // $ANTLR start "entryRuleUrl"
    // InternalMyDsl.g:353:1: entryRuleUrl : ruleUrl EOF ;
    public final void entryRuleUrl() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleUrl EOF )
            // InternalMyDsl.g:355:1: ruleUrl EOF
            {
             before(grammarAccess.getUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getUrlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrl"


    // $ANTLR start "ruleUrl"
    // InternalMyDsl.g:362:1: ruleUrl : ( ( rule__Url__Group__0 ) ) ;
    public final void ruleUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Url__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Url__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Url__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Url__Group__0 )
            {
             before(grammarAccess.getUrlAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Url__Group__0 )
            // InternalMyDsl.g:369:4: rule__Url__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Url__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrl"


    // $ANTLR start "entryRuleUrlExpresion"
    // InternalMyDsl.g:378:1: entryRuleUrlExpresion : ruleUrlExpresion EOF ;
    public final void entryRuleUrlExpresion() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleUrlExpresion EOF )
            // InternalMyDsl.g:380:1: ruleUrlExpresion EOF
            {
             before(grammarAccess.getUrlExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleUrlExpresion();

            state._fsp--;

             after(grammarAccess.getUrlExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlExpresion"


    // $ANTLR start "ruleUrlExpresion"
    // InternalMyDsl.g:387:1: ruleUrlExpresion : ( ( rule__UrlExpresion__Alternatives ) ) ;
    public final void ruleUrlExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__UrlExpresion__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__UrlExpresion__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__UrlExpresion__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__UrlExpresion__Alternatives )
            {
             before(grammarAccess.getUrlExpresionAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__UrlExpresion__Alternatives )
            // InternalMyDsl.g:394:4: rule__UrlExpresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UrlExpresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUrlExpresionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlExpresion"


    // $ANTLR start "entryRuleStringType"
    // InternalMyDsl.g:403:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleStringType EOF )
            // InternalMyDsl.g:405:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMyDsl.g:412:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__StringType__Group__0 )
            // InternalMyDsl.g:419:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:428:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleParametro EOF )
            // InternalMyDsl.g:430:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:437:1: ruleParametro : ( ( rule__Parametro__Alternatives ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Parametro__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Parametro__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Parametro__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__Parametro__Alternatives )
            {
             before(grammarAccess.getParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__Parametro__Alternatives )
            // InternalMyDsl.g:444:4: rule__Parametro__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleQueryParam"
    // InternalMyDsl.g:453:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleQueryParam EOF )
            // InternalMyDsl.g:455:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalMyDsl.g:462:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__QueryParam__Group__0 )
            // InternalMyDsl.g:469:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRulePathParam"
    // InternalMyDsl.g:478:1: entryRulePathParam : rulePathParam EOF ;
    public final void entryRulePathParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( rulePathParam EOF )
            // InternalMyDsl.g:480:1: rulePathParam EOF
            {
             before(grammarAccess.getPathParamRule()); 
            pushFollow(FOLLOW_1);
            rulePathParam();

            state._fsp--;

             after(grammarAccess.getPathParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathParam"


    // $ANTLR start "rulePathParam"
    // InternalMyDsl.g:487:1: rulePathParam : ( ( rule__PathParam__Group__0 ) ) ;
    public final void rulePathParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__PathParam__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__PathParam__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__PathParam__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__PathParam__Group__0 )
            {
             before(grammarAccess.getPathParamAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__PathParam__Group__0 )
            // InternalMyDsl.g:494:4: rule__PathParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathParam"


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:503:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleResponse EOF )
            // InternalMyDsl.g:505:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMyDsl.g:512:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:519:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:528:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleRequest EOF )
            // InternalMyDsl.g:530:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:537:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:544:4: rule__Request__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:553:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:555:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:562:1: rulePrimitiveType : ( ( rule__PrimitiveType__NameAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__PrimitiveType__NameAssignment ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__PrimitiveType__NameAssignment ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__PrimitiveType__NameAssignment ) )
            // InternalMyDsl.g:568:3: ( rule__PrimitiveType__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 
            // InternalMyDsl.g:569:3: ( rule__PrimitiveType__NameAssignment )
            // InternalMyDsl.g:569:4: rule__PrimitiveType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleDatoPrimitivo"
    // InternalMyDsl.g:578:1: entryRuleDatoPrimitivo : ruleDatoPrimitivo EOF ;
    public final void entryRuleDatoPrimitivo() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleDatoPrimitivo EOF )
            // InternalMyDsl.g:580:1: ruleDatoPrimitivo EOF
            {
             before(grammarAccess.getDatoPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getDatoPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatoPrimitivo"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalMyDsl.g:587:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalMyDsl.g:593:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalMyDsl.g:594:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalMyDsl.g:594:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:603:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTest EOF )
            // InternalMyDsl.g:605:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:612:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Test__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Test__Group__0 )
            // InternalMyDsl.g:619:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:628:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMapping EOF )
            // InternalMyDsl.g:630:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMyDsl.g:637:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:644:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAsercion"
    // InternalMyDsl.g:653:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:655:1: ruleAsercion EOF
            {
             before(grammarAccess.getAsercionRule()); 
            pushFollow(FOLLOW_1);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAsercionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // InternalMyDsl.g:662:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:669:4: rule__Asercion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:678:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:680:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:687:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:694:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:703:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleEInt EOF )
            // InternalMyDsl.g:705:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:712:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:717:2: ( RULE_INT )
            {
            // InternalMyDsl.g:717:2: ( RULE_INT )
            // InternalMyDsl.g:718:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:728:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleEString EOF )
            // InternalMyDsl.g:730:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:737:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:743:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:744:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:744:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:753:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleQualifiedName EOF )
            // InternalMyDsl.g:755:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:762:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__QualifiedName__Group__0 )
            // InternalMyDsl.g:769:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:778:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:783:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:783:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:784:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:785:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:785:4: rule__TipoAtributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "ruleOperador"
    // InternalMyDsl.g:794:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalMyDsl.g:799:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalMyDsl.g:799:2: ( ( rule__Operador__Alternatives ) )
            // InternalMyDsl.g:800:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalMyDsl.g:801:3: ( rule__Operador__Alternatives )
            // InternalMyDsl.g:801:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:810:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:815:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:815:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:816:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:817:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:817:4: rule__Mockaroo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mockaroo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMockarooAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockaroo"


    // $ANTLR start "ruleTipoMetodoRest"
    // InternalMyDsl.g:826:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:831:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:831:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:832:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:833:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:833:4: rule__TipoMetodoRest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoMetodoRest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoMetodoRest"


    // $ANTLR start "rule__Entidad__Alternatives"
    // InternalMyDsl.g:841:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==52) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:846:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:846:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:847:3: ruleSimpleEntity
                    {
                     before(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:852:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:852:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:853:3: ruleMockarooEntity
                    {
                     before(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMockarooEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Alternatives"


    // $ANTLR start "rule__Atributo__Alternatives"
    // InternalMyDsl.g:862:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==50) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_2==50) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_3==50) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:867:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:867:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:868:3: ruleAtributoMocka
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoMocka();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:873:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:873:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:874:3: ruleAtributoArreglo
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoArreglo();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:879:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:879:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:880:3: ruleAtributoSimple
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoSimple();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Alternatives"


    // $ANTLR start "rule__AtributoMocka__Alternatives_2_1"
    // InternalMyDsl.g:889:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==73) ) {
                alt3=1;
            }
            else if ( (LA3_0==49) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:894:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:894:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:895:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:896:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:896:4: rule__AtributoMocka__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:900:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:900:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:901:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:902:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:902:4: rule__AtributoMocka__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Alternatives_2_1"


    // $ANTLR start "rule__UrlExpresion__Alternatives"
    // InternalMyDsl.g:910:1: rule__UrlExpresion__Alternatives : ( ( ruleStringType ) | ( ruleParametro ) );
    public final void rule__UrlExpresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( ruleStringType ) | ( ruleParametro ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==54) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=55 && LA4_0<=57)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:915:2: ( ruleStringType )
                    {
                    // InternalMyDsl.g:915:2: ( ruleStringType )
                    // InternalMyDsl.g:916:3: ruleStringType
                    {
                     before(grammarAccess.getUrlExpresionAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getUrlExpresionAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:921:2: ( ruleParametro )
                    {
                    // InternalMyDsl.g:921:2: ( ruleParametro )
                    // InternalMyDsl.g:922:3: ruleParametro
                    {
                     before(grammarAccess.getUrlExpresionAccess().getParametroParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParametro();

                    state._fsp--;

                     after(grammarAccess.getUrlExpresionAccess().getParametroParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlExpresion__Alternatives"


    // $ANTLR start "rule__Parametro__Alternatives"
    // InternalMyDsl.g:931:1: rule__Parametro__Alternatives : ( ( ruleQueryParam ) | ( rulePathParam ) );
    public final void rule__Parametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ruleQueryParam ) | ( rulePathParam ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=55 && LA5_0<=56)) ) {
                alt5=1;
            }
            else if ( (LA5_0==57) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:936:2: ( ruleQueryParam )
                    {
                    // InternalMyDsl.g:936:2: ( ruleQueryParam )
                    // InternalMyDsl.g:937:3: ruleQueryParam
                    {
                     before(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:942:2: ( rulePathParam )
                    {
                    // InternalMyDsl.g:942:2: ( rulePathParam )
                    // InternalMyDsl.g:943:3: rulePathParam
                    {
                     before(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePathParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Alternatives"


    // $ANTLR start "rule__Response__Alternatives_4"
    // InternalMyDsl.g:952:1: rule__Response__Alternatives_4 : ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Response__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=19)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:957:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:957:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:958:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:959:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:959:4: rule__Response__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:963:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:963:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:964:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:965:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:965:4: rule__Response__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Alternatives_4"


    // $ANTLR start "rule__Request__Alternatives_4"
    // InternalMyDsl.g:973:1: rule__Request__Alternatives_4 : ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Request__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=17 && LA7_0<=19)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:978:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:978:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:979:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:980:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:980:4: rule__Request__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:984:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:984:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:985:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:986:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:986:4: rule__Request__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Alternatives_4"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalMyDsl.g:994:1: rule__DatoPrimitivo__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 15:
            case 16:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:999:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:999:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:1000:3: ruleMyNumeric
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMyNumeric();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1005:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:1005:2: ( ruleMyString )
                    // InternalMyDsl.g:1006:3: ruleMyString
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMyString();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1011:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:1011:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:1012:3: ruleMyBoolean
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMyBoolean();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Mapping__Alternatives_6"
    // InternalMyDsl.g:1021:1: rule__Mapping__Alternatives_6 : ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) );
    public final void rule__Mapping__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==69) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=15 && LA9_0<=16)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1026:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    {
                    // InternalMyDsl.g:1026:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    // InternalMyDsl.g:1027:3: ( rule__Mapping__Group_6_0__0 )
                    {
                     before(grammarAccess.getMappingAccess().getGroup_6_0()); 
                    // InternalMyDsl.g:1028:3: ( rule__Mapping__Group_6_0__0 )
                    // InternalMyDsl.g:1028:4: rule__Mapping__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1032:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    {
                    // InternalMyDsl.g:1032:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    // InternalMyDsl.g:1033:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    {
                     before(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 
                    // InternalMyDsl.g:1034:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    // InternalMyDsl.g:1034:4: rule__Mapping__DatoprimitivoAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__DatoprimitivoAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Alternatives_6"


    // $ANTLR start "rule__Asercion__Alternatives_0"
    // InternalMyDsl.g:1042:1: rule__Asercion__Alternatives_0 : ( ( 'response.status' ) | ( 'response' ) | ( ( rule__Asercion__Group_0_2__0 ) ) );
    public final void rule__Asercion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( 'response.status' ) | ( 'response' ) | ( ( rule__Asercion__Group_0_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 70:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1047:2: ( 'response.status' )
                    {
                    // InternalMyDsl.g:1047:2: ( 'response.status' )
                    // InternalMyDsl.g:1048:3: 'response.status'
                    {
                     before(grammarAccess.getAsercionAccess().getResponseStatusKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAsercionAccess().getResponseStatusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1053:2: ( 'response' )
                    {
                    // InternalMyDsl.g:1053:2: ( 'response' )
                    // InternalMyDsl.g:1054:3: 'response'
                    {
                     before(grammarAccess.getAsercionAccess().getResponseKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAsercionAccess().getResponseKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1059:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:1059:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    // InternalMyDsl.g:1060:3: ( rule__Asercion__Group_0_2__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_0_2()); 
                    // InternalMyDsl.g:1061:3: ( rule__Asercion__Group_0_2__0 )
                    // InternalMyDsl.g:1061:4: rule__Asercion__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Alternatives_0"


    // $ANTLR start "rule__Asercion__Alternatives_2"
    // InternalMyDsl.g:1069:1: rule__Asercion__Alternatives_2 : ( ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) );
    public final void rule__Asercion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||(LA11_0>=15 && LA11_0<=16)) ) {
                alt11=1;
            }
            else if ( (LA11_0==71) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1074:2: ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) )
                    {
                    // InternalMyDsl.g:1074:2: ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) )
                    // InternalMyDsl.g:1075:3: ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 )
                    {
                     before(grammarAccess.getAsercionAccess().getElementoPrimitivo2Assignment_2_0()); 
                    // InternalMyDsl.g:1076:3: ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 )
                    // InternalMyDsl.g:1076:4: rule__Asercion__ElementoPrimitivo2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__ElementoPrimitivo2Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getElementoPrimitivo2Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1080:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1080:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    // InternalMyDsl.g:1081:3: ( rule__Asercion__Group_2_1__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1082:3: ( rule__Asercion__Group_2_1__0 )
                    // InternalMyDsl.g:1082:4: rule__Asercion__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Alternatives_2"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:1090:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1095:2: ( 'true' )
                    {
                    // InternalMyDsl.g:1095:2: ( 'true' )
                    // InternalMyDsl.g:1096:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1101:2: ( 'false' )
                    {
                    // InternalMyDsl.g:1101:2: ( 'false' )
                    // InternalMyDsl.g:1102:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:1111:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1116:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1116:2: ( RULE_STRING )
                    // InternalMyDsl.g:1117:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1122:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1122:2: ( RULE_ID )
                    // InternalMyDsl.g:1123:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TipoAtributo__Alternatives"
    // InternalMyDsl.g:1132:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1137:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:1137:2: ( ( 'string' ) )
                    // InternalMyDsl.g:1138:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1139:3: ( 'string' )
                    // InternalMyDsl.g:1139:4: 'string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1143:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:1143:2: ( ( 'int' ) )
                    // InternalMyDsl.g:1144:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1145:3: ( 'int' )
                    // InternalMyDsl.g:1145:4: 'int'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1149:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:1149:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:1150:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1151:3: ( 'boolean' )
                    // InternalMyDsl.g:1151:4: 'boolean'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalMyDsl.g:1159:1: rule__Operador__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 21:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            case 24:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1164:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:1164:2: ( ( '==' ) )
                    // InternalMyDsl.g:1165:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1166:3: ( '==' )
                    // InternalMyDsl.g:1166:4: '=='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1170:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:1170:2: ( ( '>' ) )
                    // InternalMyDsl.g:1171:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1172:3: ( '>' )
                    // InternalMyDsl.g:1172:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1176:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:1176:2: ( ( '<' ) )
                    // InternalMyDsl.g:1177:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1178:3: ( '<' )
                    // InternalMyDsl.g:1178:4: '<'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1182:2: ( ( '>=' ) )
                    {
                    // InternalMyDsl.g:1182:2: ( ( '>=' ) )
                    // InternalMyDsl.g:1183:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1184:3: ( '>=' )
                    // InternalMyDsl.g:1184:4: '>='
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1188:2: ( ( '<=' ) )
                    {
                    // InternalMyDsl.g:1188:2: ( ( '<=' ) )
                    // InternalMyDsl.g:1189:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1190:3: ( '<=' )
                    // InternalMyDsl.g:1190:4: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__Mockaroo__Alternatives"
    // InternalMyDsl.g:1198:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            case 33:
                {
                alt16=9;
                }
                break;
            case 34:
                {
                alt16=10;
                }
                break;
            case 35:
                {
                alt16=11;
                }
                break;
            case 36:
                {
                alt16=12;
                }
                break;
            case 37:
                {
                alt16=13;
                }
                break;
            case 38:
                {
                alt16=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1203:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:1203:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:1204:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1205:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:1205:4: 'FirstNameType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1209:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:1209:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:1210:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1211:3: ( 'LastNameType' )
                    // InternalMyDsl.g:1211:4: 'LastNameType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1215:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:1215:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:1216:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1217:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:1217:4: 'FamilyNameType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1221:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:1221:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:1222:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1223:3: ( 'FullNameType' )
                    // InternalMyDsl.g:1223:4: 'FullNameType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1227:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:1227:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:1228:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1229:3: ( 'GenderType' )
                    // InternalMyDsl.g:1229:4: 'GenderType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1233:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:1233:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:1234:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1235:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:1235:4: 'EmailAddressType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1239:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:1239:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:1240:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1241:3: ( 'PhoneType' )
                    // InternalMyDsl.g:1241:4: 'PhoneType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1245:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:1245:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:1246:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1247:3: ( 'CountryType' )
                    // InternalMyDsl.g:1247:4: 'CountryType'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1251:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:1251:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:1252:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1253:3: ( 'CityType' )
                    // InternalMyDsl.g:1253:4: 'CityType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1257:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:1257:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:1258:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:1259:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:1259:4: 'CountryCodeType'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1263:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:1263:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:1264:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:1265:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:1265:4: 'LatitudeType'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1269:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:1269:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:1270:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:1271:3: ( 'LongitudType' )
                    // InternalMyDsl.g:1271:4: 'LongitudType'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1275:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:1275:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:1276:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:1277:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:1277:4: 'RowNumberType'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1281:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:1281:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:1282:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:1283:3: ( 'BooleanType' )
                    // InternalMyDsl.g:1283:4: 'BooleanType'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mockaroo__Alternatives"


    // $ANTLR start "rule__TipoMetodoRest__Alternatives"
    // InternalMyDsl.g:1291:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1296:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:1296:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:1297:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1298:3: ( 'GET' )
                    // InternalMyDsl.g:1298:4: 'GET'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1302:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:1302:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:1303:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1304:3: ( 'POST' )
                    // InternalMyDsl.g:1304:4: 'POST'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1308:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:1308:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:1309:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1310:3: ( 'PUT' )
                    // InternalMyDsl.g:1310:4: 'PUT'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1314:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:1314:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:1315:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1316:3: ( 'DELETE' )
                    // InternalMyDsl.g:1316:4: 'DELETE'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoMetodoRest__Alternatives"


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:1324:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1329:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // InternalMyDsl.g:1336:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( () ) )
            // InternalMyDsl.g:1341:1: ( () )
            {
            // InternalMyDsl.g:1341:1: ( () )
            // InternalMyDsl.g:1342:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1343:2: ()
            // InternalMyDsl.g:1343:3: 
            {
            }

             after(grammarAccess.getApiAccess().getApiAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // InternalMyDsl.g:1351:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1356:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // InternalMyDsl.g:1363:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1368:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1368:1: ( 'apiURL' )
            // InternalMyDsl.g:1369:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getApiURLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Api__Group__2"
    // InternalMyDsl.g:1378:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1383:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2"


    // $ANTLR start "rule__Api__Group__2__Impl"
    // InternalMyDsl.g:1390:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1395:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1395:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1396:2: RULE_EQUAL
            {
             before(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__3"
    // InternalMyDsl.g:1405:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1410:2: rule__Api__Group__3__Impl rule__Api__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Api__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3"


    // $ANTLR start "rule__Api__Group__3__Impl"
    // InternalMyDsl.g:1417:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1422:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1422:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1423:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1424:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1424:3: rule__Api__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Api__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3__Impl"


    // $ANTLR start "rule__Api__Group__4"
    // InternalMyDsl.g:1432:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1437:2: rule__Api__Group__4__Impl rule__Api__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4"


    // $ANTLR start "rule__Api__Group__4__Impl"
    // InternalMyDsl.g:1444:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1449:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1449:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1450:2: RULE_SEMICOLON
            {
             before(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4__Impl"


    // $ANTLR start "rule__Api__Group__5"
    // InternalMyDsl.g:1459:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1464:2: rule__Api__Group__5__Impl rule__Api__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5"


    // $ANTLR start "rule__Api__Group__5__Impl"
    // InternalMyDsl.g:1471:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1476:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1476:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1477:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1478:2: ( rule__Api__EntidadesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44||LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1478:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5__Impl"


    // $ANTLR start "rule__Api__Group__6"
    // InternalMyDsl.g:1486:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1491:2: rule__Api__Group__6__Impl rule__Api__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__6"


    // $ANTLR start "rule__Api__Group__6__Impl"
    // InternalMyDsl.g:1498:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1503:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1503:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1504:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1505:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=19)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1505:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__6__Impl"


    // $ANTLR start "rule__Api__Group__7"
    // InternalMyDsl.g:1513:1: rule__Api__Group__7 : rule__Api__Group__7__Impl rule__Api__Group__8 ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Api__Group__7__Impl rule__Api__Group__8 )
            // InternalMyDsl.g:1518:2: rule__Api__Group__7__Impl rule__Api__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__7"


    // $ANTLR start "rule__Api__Group__7__Impl"
    // InternalMyDsl.g:1525:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1530:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1530:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1531:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1532:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=39 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1532:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__7__Impl"


    // $ANTLR start "rule__Api__Group__8"
    // InternalMyDsl.g:1540:1: rule__Api__Group__8 : rule__Api__Group__8__Impl ;
    public final void rule__Api__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Api__Group__8__Impl )
            // InternalMyDsl.g:1545:2: rule__Api__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8"


    // $ANTLR start "rule__Api__Group__8__Impl"
    // InternalMyDsl.g:1551:1: rule__Api__Group__8__Impl : ( ( rule__Api__TestsAssignment_8 )* ) ;
    public final void rule__Api__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ( rule__Api__TestsAssignment_8 )* ) )
            // InternalMyDsl.g:1556:1: ( ( rule__Api__TestsAssignment_8 )* )
            {
            // InternalMyDsl.g:1556:1: ( ( rule__Api__TestsAssignment_8 )* )
            // InternalMyDsl.g:1557:2: ( rule__Api__TestsAssignment_8 )*
            {
             before(grammarAccess.getApiAccess().getTestsAssignment_8()); 
            // InternalMyDsl.g:1558:2: ( rule__Api__TestsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==61) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1558:3: rule__Api__TestsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Api__TestsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getTestsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:1567:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:1572:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0"


    // $ANTLR start "rule__SimpleEntity__Group__0__Impl"
    // InternalMyDsl.g:1579:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:1584:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:1584:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:1585:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__1"
    // InternalMyDsl.g:1594:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:1599:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SimpleEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1"


    // $ANTLR start "rule__SimpleEntity__Group__1__Impl"
    // InternalMyDsl.g:1606:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NameAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( rule__SimpleEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1611:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1611:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1612:2: ( rule__SimpleEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1613:2: ( rule__SimpleEntity__NameAssignment_1 )
            // InternalMyDsl.g:1613:3: rule__SimpleEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__2"
    // InternalMyDsl.g:1621:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:1626:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SimpleEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2"


    // $ANTLR start "rule__SimpleEntity__Group__2__Impl"
    // InternalMyDsl.g:1633:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( '{' ) )
            // InternalMyDsl.g:1638:1: ( '{' )
            {
            // InternalMyDsl.g:1638:1: ( '{' )
            // InternalMyDsl.g:1639:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__3"
    // InternalMyDsl.g:1648:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:1653:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SimpleEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3"


    // $ANTLR start "rule__SimpleEntity__Group__3__Impl"
    // InternalMyDsl.g:1660:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1665:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1665:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1666:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1667:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1667:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__4"
    // InternalMyDsl.g:1675:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:1680:2: rule__SimpleEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4"


    // $ANTLR start "rule__SimpleEntity__Group__4__Impl"
    // InternalMyDsl.g:1686:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( '}' ) )
            // InternalMyDsl.g:1691:1: ( '}' )
            {
            // InternalMyDsl.g:1691:1: ( '}' )
            // InternalMyDsl.g:1692:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:1702:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1707:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AtributoMocka__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0"


    // $ANTLR start "rule__AtributoMocka__Group__0__Impl"
    // InternalMyDsl.g:1714:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1719:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1719:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1720:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1721:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1721:3: rule__AtributoMocka__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__1"
    // InternalMyDsl.g:1729:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1734:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AtributoMocka__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1"


    // $ANTLR start "rule__AtributoMocka__Group__1__Impl"
    // InternalMyDsl.g:1741:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NameAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__AtributoMocka__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1746:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            // InternalMyDsl.g:1747:2: ( rule__AtributoMocka__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1748:2: ( rule__AtributoMocka__NameAssignment_1 )
            // InternalMyDsl.g:1748:3: rule__AtributoMocka__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__2"
    // InternalMyDsl.g:1756:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1761:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AtributoMocka__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2"


    // $ANTLR start "rule__AtributoMocka__Group__2__Impl"
    // InternalMyDsl.g:1768:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1773:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1773:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1774:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1775:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1775:3: rule__AtributoMocka__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__3"
    // InternalMyDsl.g:1783:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1788:2: rule__AtributoMocka__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3"


    // $ANTLR start "rule__AtributoMocka__Group__3__Impl"
    // InternalMyDsl.g:1794:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1799:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1799:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1800:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__0"
    // InternalMyDsl.g:1810:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1815:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__AtributoMocka__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0"


    // $ANTLR start "rule__AtributoMocka__Group_2__0__Impl"
    // InternalMyDsl.g:1822:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( '(' ) )
            // InternalMyDsl.g:1827:1: ( '(' )
            {
            // InternalMyDsl.g:1827:1: ( '(' )
            // InternalMyDsl.g:1828:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__1"
    // InternalMyDsl.g:1837:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1842:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__AtributoMocka__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1"


    // $ANTLR start "rule__AtributoMocka__Group_2__1__Impl"
    // InternalMyDsl.g:1849:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1854:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1854:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1855:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1856:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1856:3: rule__AtributoMocka__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__2"
    // InternalMyDsl.g:1864:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1869:2: rule__AtributoMocka__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2"


    // $ANTLR start "rule__AtributoMocka__Group_2__2__Impl"
    // InternalMyDsl.g:1875:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ')' ) )
            // InternalMyDsl.g:1880:1: ( ')' )
            {
            // InternalMyDsl.g:1880:1: ( ')' )
            // InternalMyDsl.g:1881:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0"
    // InternalMyDsl.g:1891:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1896:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0__Impl"
    // InternalMyDsl.g:1903:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1908:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1909:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1910:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1910:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1"
    // InternalMyDsl.g:1918:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1923:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__AtributoMocka__Group_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1__Impl"
    // InternalMyDsl.g:1930:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1935:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1935:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1936:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2"
    // InternalMyDsl.g:1945:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1950:2: rule__AtributoMocka__Group_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2__Impl"
    // InternalMyDsl.g:1956:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1961:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1961:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1962:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1963:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1963:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0"
    // InternalMyDsl.g:1972:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1977:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0__Impl"
    // InternalMyDsl.g:1984:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1989:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1989:1: ( 'mockType' )
            // InternalMyDsl.g:1990:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1"
    // InternalMyDsl.g:1999:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:2004:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__AtributoMocka__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1__Impl"
    // InternalMyDsl.g:2011:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2016:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2016:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2017:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2"
    // InternalMyDsl.g:2026:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:2031:2: rule__AtributoMocka__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2__Impl"
    // InternalMyDsl.g:2037:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:2042:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:2042:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:2043:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:2044:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:2044:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__0"
    // InternalMyDsl.g:2053:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:2058:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AtributoArreglo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0"


    // $ANTLR start "rule__AtributoArreglo__Group__0__Impl"
    // InternalMyDsl.g:2065:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2070:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2070:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:2071:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2072:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:2072:3: rule__AtributoArreglo__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__1"
    // InternalMyDsl.g:2080:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:2085:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AtributoArreglo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1"


    // $ANTLR start "rule__AtributoArreglo__Group__1__Impl"
    // InternalMyDsl.g:2092:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( '[' ) )
            // InternalMyDsl.g:2097:1: ( '[' )
            {
            // InternalMyDsl.g:2097:1: ( '[' )
            // InternalMyDsl.g:2098:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__2"
    // InternalMyDsl.g:2107:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:2112:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AtributoArreglo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2"


    // $ANTLR start "rule__AtributoArreglo__Group__2__Impl"
    // InternalMyDsl.g:2119:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( ']' ) )
            // InternalMyDsl.g:2124:1: ( ']' )
            {
            // InternalMyDsl.g:2124:1: ( ']' )
            // InternalMyDsl.g:2125:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__3"
    // InternalMyDsl.g:2134:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:2139:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AtributoArreglo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3"


    // $ANTLR start "rule__AtributoArreglo__Group__3__Impl"
    // InternalMyDsl.g:2146:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NameAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ( rule__AtributoArreglo__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2151:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2151:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            // InternalMyDsl.g:2152:2: ( rule__AtributoArreglo__NameAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2153:2: ( rule__AtributoArreglo__NameAssignment_3 )
            // InternalMyDsl.g:2153:3: rule__AtributoArreglo__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__4"
    // InternalMyDsl.g:2161:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:2166:2: rule__AtributoArreglo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4"


    // $ANTLR start "rule__AtributoArreglo__Group__4__Impl"
    // InternalMyDsl.g:2172:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2177:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2177:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2178:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__0"
    // InternalMyDsl.g:2188:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:2193:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AtributoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0"


    // $ANTLR start "rule__AtributoSimple__Group__0__Impl"
    // InternalMyDsl.g:2200:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2205:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2205:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:2206:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2207:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:2207:3: rule__AtributoSimple__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__1"
    // InternalMyDsl.g:2215:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:2220:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AtributoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1"


    // $ANTLR start "rule__AtributoSimple__Group__1__Impl"
    // InternalMyDsl.g:2227:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NameAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( ( rule__AtributoSimple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2232:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2232:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            // InternalMyDsl.g:2233:2: ( rule__AtributoSimple__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2234:2: ( rule__AtributoSimple__NameAssignment_1 )
            // InternalMyDsl.g:2234:3: rule__AtributoSimple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__2"
    // InternalMyDsl.g:2242:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:2247:2: rule__AtributoSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2"


    // $ANTLR start "rule__AtributoSimple__Group__2__Impl"
    // InternalMyDsl.g:2253:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2258:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2258:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2259:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__0"
    // InternalMyDsl.g:2269:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:2274:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MockarooEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0"


    // $ANTLR start "rule__MockarooEntity__Group__0__Impl"
    // InternalMyDsl.g:2281:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:2286:1: ( 'Entity' )
            {
            // InternalMyDsl.g:2286:1: ( 'Entity' )
            // InternalMyDsl.g:2287:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__1"
    // InternalMyDsl.g:2296:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:2301:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MockarooEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1"


    // $ANTLR start "rule__MockarooEntity__Group__1__Impl"
    // InternalMyDsl.g:2308:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NameAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( ( rule__MockarooEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2313:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2313:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:2314:2: ( rule__MockarooEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2315:2: ( rule__MockarooEntity__NameAssignment_1 )
            // InternalMyDsl.g:2315:3: rule__MockarooEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__2"
    // InternalMyDsl.g:2323:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:2328:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MockarooEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2"


    // $ANTLR start "rule__MockarooEntity__Group__2__Impl"
    // InternalMyDsl.g:2335:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( '{' ) )
            // InternalMyDsl.g:2340:1: ( '{' )
            {
            // InternalMyDsl.g:2340:1: ( '{' )
            // InternalMyDsl.g:2341:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__3"
    // InternalMyDsl.g:2350:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:2355:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MockarooEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3"


    // $ANTLR start "rule__MockarooEntity__Group__3__Impl"
    // InternalMyDsl.g:2362:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2367:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2368:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2369:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=19)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2369:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__4"
    // InternalMyDsl.g:2377:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:2382:2: rule__MockarooEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4"


    // $ANTLR start "rule__MockarooEntity__Group__4__Impl"
    // InternalMyDsl.g:2388:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( '}' ) )
            // InternalMyDsl.g:2393:1: ( '}' )
            {
            // InternalMyDsl.g:2393:1: ( '}' )
            // InternalMyDsl.g:2394:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group__0"
    // InternalMyDsl.g:2404:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:2409:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServicioRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__0"


    // $ANTLR start "rule__ServicioRest__Group__0__Impl"
    // InternalMyDsl.g:2416:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:2421:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:2421:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:2422:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:2423:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:2423:3: rule__ServicioRest__MetodoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__MetodoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__0__Impl"


    // $ANTLR start "rule__ServicioRest__Group__1"
    // InternalMyDsl.g:2431:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:2436:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ServicioRest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__1"


    // $ANTLR start "rule__ServicioRest__Group__1__Impl"
    // InternalMyDsl.g:2443:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NameAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ( rule__ServicioRest__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2448:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2448:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            // InternalMyDsl.g:2449:2: ( rule__ServicioRest__NameAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2450:2: ( rule__ServicioRest__NameAssignment_1 )
            // InternalMyDsl.g:2450:3: rule__ServicioRest__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__1__Impl"


    // $ANTLR start "rule__ServicioRest__Group__2"
    // InternalMyDsl.g:2458:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:2463:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ServicioRest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__2"


    // $ANTLR start "rule__ServicioRest__Group__2__Impl"
    // InternalMyDsl.g:2470:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( '{' ) )
            // InternalMyDsl.g:2475:1: ( '{' )
            {
            // InternalMyDsl.g:2475:1: ( '{' )
            // InternalMyDsl.g:2476:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__2__Impl"


    // $ANTLR start "rule__ServicioRest__Group__3"
    // InternalMyDsl.g:2485:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2490:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ServicioRest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__3"


    // $ANTLR start "rule__ServicioRest__Group__3__Impl"
    // InternalMyDsl.g:2497:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2502:1: ( 'URL' )
            {
            // InternalMyDsl.g:2502:1: ( 'URL' )
            // InternalMyDsl.g:2503:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__3__Impl"


    // $ANTLR start "rule__ServicioRest__Group__4"
    // InternalMyDsl.g:2512:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2517:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ServicioRest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__4"


    // $ANTLR start "rule__ServicioRest__Group__4__Impl"
    // InternalMyDsl.g:2524:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2529:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2529:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2530:2: RULE_EQUAL
            {
             before(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group__5"
    // InternalMyDsl.g:2539:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2544:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ServicioRest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__5"


    // $ANTLR start "rule__ServicioRest__Group__5__Impl"
    // InternalMyDsl.g:2551:1: rule__ServicioRest__Group__5__Impl : ( ( rule__ServicioRest__UrlAssignment_5 ) ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( ( rule__ServicioRest__UrlAssignment_5 ) ) )
            // InternalMyDsl.g:2556:1: ( ( rule__ServicioRest__UrlAssignment_5 ) )
            {
            // InternalMyDsl.g:2556:1: ( ( rule__ServicioRest__UrlAssignment_5 ) )
            // InternalMyDsl.g:2557:2: ( rule__ServicioRest__UrlAssignment_5 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_5()); 
            // InternalMyDsl.g:2558:2: ( rule__ServicioRest__UrlAssignment_5 )
            // InternalMyDsl.g:2558:3: rule__ServicioRest__UrlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__UrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getUrlAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__5__Impl"


    // $ANTLR start "rule__ServicioRest__Group__6"
    // InternalMyDsl.g:2566:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2571:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__6"


    // $ANTLR start "rule__ServicioRest__Group__6__Impl"
    // InternalMyDsl.g:2578:1: rule__ServicioRest__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2583:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2583:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2584:2: RULE_SEMICOLON
            {
             before(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__6__Impl"


    // $ANTLR start "rule__ServicioRest__Group__7"
    // InternalMyDsl.g:2593:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2598:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__7"


    // $ANTLR start "rule__ServicioRest__Group__7__Impl"
    // InternalMyDsl.g:2605:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__RequestAssignment_7 )? ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( ( rule__ServicioRest__RequestAssignment_7 )? ) )
            // InternalMyDsl.g:2610:1: ( ( rule__ServicioRest__RequestAssignment_7 )? )
            {
            // InternalMyDsl.g:2610:1: ( ( rule__ServicioRest__RequestAssignment_7 )? )
            // InternalMyDsl.g:2611:2: ( rule__ServicioRest__RequestAssignment_7 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_7()); 
            // InternalMyDsl.g:2612:2: ( rule__ServicioRest__RequestAssignment_7 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2612:3: rule__ServicioRest__RequestAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__RequestAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServicioRestAccess().getRequestAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__7__Impl"


    // $ANTLR start "rule__ServicioRest__Group__8"
    // InternalMyDsl.g:2620:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2625:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__ServicioRest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__8"


    // $ANTLR start "rule__ServicioRest__Group__8__Impl"
    // InternalMyDsl.g:2632:1: rule__ServicioRest__Group__8__Impl : ( ( rule__ServicioRest__ResponseAssignment_8 ) ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ( rule__ServicioRest__ResponseAssignment_8 ) ) )
            // InternalMyDsl.g:2637:1: ( ( rule__ServicioRest__ResponseAssignment_8 ) )
            {
            // InternalMyDsl.g:2637:1: ( ( rule__ServicioRest__ResponseAssignment_8 ) )
            // InternalMyDsl.g:2638:2: ( rule__ServicioRest__ResponseAssignment_8 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_8()); 
            // InternalMyDsl.g:2639:2: ( rule__ServicioRest__ResponseAssignment_8 )
            // InternalMyDsl.g:2639:3: rule__ServicioRest__ResponseAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__ResponseAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getResponseAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__8__Impl"


    // $ANTLR start "rule__ServicioRest__Group__9"
    // InternalMyDsl.g:2647:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__ServicioRest__Group__9__Impl )
            // InternalMyDsl.g:2652:2: rule__ServicioRest__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__9"


    // $ANTLR start "rule__ServicioRest__Group__9__Impl"
    // InternalMyDsl.g:2658:1: rule__ServicioRest__Group__9__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( '}' ) )
            // InternalMyDsl.g:2663:1: ( '}' )
            {
            // InternalMyDsl.g:2663:1: ( '}' )
            // InternalMyDsl.g:2664:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__9__Impl"


    // $ANTLR start "rule__Url__Group__0"
    // InternalMyDsl.g:2674:1: rule__Url__Group__0 : rule__Url__Group__0__Impl rule__Url__Group__1 ;
    public final void rule__Url__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__Url__Group__0__Impl rule__Url__Group__1 )
            // InternalMyDsl.g:2679:2: rule__Url__Group__0__Impl rule__Url__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Url__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Url__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__0"


    // $ANTLR start "rule__Url__Group__0__Impl"
    // InternalMyDsl.g:2686:1: rule__Url__Group__0__Impl : ( () ) ;
    public final void rule__Url__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( () ) )
            // InternalMyDsl.g:2691:1: ( () )
            {
            // InternalMyDsl.g:2691:1: ( () )
            // InternalMyDsl.g:2692:2: ()
            {
             before(grammarAccess.getUrlAccess().getUrlAction_0()); 
            // InternalMyDsl.g:2693:2: ()
            // InternalMyDsl.g:2693:3: 
            {
            }

             after(grammarAccess.getUrlAccess().getUrlAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__0__Impl"


    // $ANTLR start "rule__Url__Group__1"
    // InternalMyDsl.g:2701:1: rule__Url__Group__1 : rule__Url__Group__1__Impl ;
    public final void rule__Url__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__Url__Group__1__Impl )
            // InternalMyDsl.g:2706:2: rule__Url__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Url__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__1"


    // $ANTLR start "rule__Url__Group__1__Impl"
    // InternalMyDsl.g:2712:1: rule__Url__Group__1__Impl : ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) ) ;
    public final void rule__Url__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) ) )
            // InternalMyDsl.g:2717:1: ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:2717:1: ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) )
            // InternalMyDsl.g:2718:2: ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* )
            {
            // InternalMyDsl.g:2718:2: ( ( rule__Url__UrlexpresionsAssignment_1 ) )
            // InternalMyDsl.g:2719:3: ( rule__Url__UrlexpresionsAssignment_1 )
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 
            // InternalMyDsl.g:2720:3: ( rule__Url__UrlexpresionsAssignment_1 )
            // InternalMyDsl.g:2720:4: rule__Url__UrlexpresionsAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Url__UrlexpresionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 

            }

            // InternalMyDsl.g:2723:2: ( ( rule__Url__UrlexpresionsAssignment_1 )* )
            // InternalMyDsl.g:2724:3: ( rule__Url__UrlexpresionsAssignment_1 )*
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 
            // InternalMyDsl.g:2725:3: ( rule__Url__UrlexpresionsAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=54 && LA25_0<=57)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2725:4: rule__Url__UrlexpresionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Url__UrlexpresionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalMyDsl.g:2735:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalMyDsl.g:2740:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalMyDsl.g:2747:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( ( () ) )
            // InternalMyDsl.g:2752:1: ( () )
            {
            // InternalMyDsl.g:2752:1: ( () )
            // InternalMyDsl.g:2753:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalMyDsl.g:2754:2: ()
            // InternalMyDsl.g:2754:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalMyDsl.g:2762:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2766:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // InternalMyDsl.g:2767:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalMyDsl.g:2774:1: rule__StringType__Group__1__Impl : ( '/' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( '/' ) )
            // InternalMyDsl.g:2779:1: ( '/' )
            {
            // InternalMyDsl.g:2779:1: ( '/' )
            // InternalMyDsl.g:2780:2: '/'
            {
             before(grammarAccess.getStringTypeAccess().getSolidusKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__2"
    // InternalMyDsl.g:2789:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( rule__StringType__Group__2__Impl )
            // InternalMyDsl.g:2794:2: rule__StringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2"


    // $ANTLR start "rule__StringType__Group__2__Impl"
    // InternalMyDsl.g:2800:1: rule__StringType__Group__2__Impl : ( ( rule__StringType__TextAssignment_2 ) ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( ( rule__StringType__TextAssignment_2 ) ) )
            // InternalMyDsl.g:2805:1: ( ( rule__StringType__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:2805:1: ( ( rule__StringType__TextAssignment_2 ) )
            // InternalMyDsl.g:2806:2: ( rule__StringType__TextAssignment_2 )
            {
             before(grammarAccess.getStringTypeAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:2807:2: ( rule__StringType__TextAssignment_2 )
            // InternalMyDsl.g:2807:3: rule__StringType__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringType__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalMyDsl.g:2816:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2820:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMyDsl.g:2821:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalMyDsl.g:2828:1: rule__QueryParam__Group__0__Impl : ( ( '?' )? ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( ( ( '?' )? ) )
            // InternalMyDsl.g:2833:1: ( ( '?' )? )
            {
            // InternalMyDsl.g:2833:1: ( ( '?' )? )
            // InternalMyDsl.g:2834:2: ( '?' )?
            {
             before(grammarAccess.getQueryParamAccess().getQuestionMarkKeyword_0()); 
            // InternalMyDsl.g:2835:2: ( '?' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2835:3: '?'
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQueryParamAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalMyDsl.g:2843:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalMyDsl.g:2848:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__QueryParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalMyDsl.g:2855:1: rule__QueryParam__Group__1__Impl : ( '${' ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( ( '${' ) )
            // InternalMyDsl.g:2860:1: ( '${' )
            {
            // InternalMyDsl.g:2860:1: ( '${' )
            // InternalMyDsl.g:2861:2: '${'
            {
             before(grammarAccess.getQueryParamAccess().getDollarSignLeftCurlyBracketKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getDollarSignLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__2"
    // InternalMyDsl.g:2870:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2874:1: ( rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 )
            // InternalMyDsl.g:2875:2: rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__QueryParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2"


    // $ANTLR start "rule__QueryParam__Group__2__Impl"
    // InternalMyDsl.g:2882:1: rule__QueryParam__Group__2__Impl : ( ( rule__QueryParam__NameAssignment_2 ) ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2886:1: ( ( ( rule__QueryParam__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2887:1: ( ( rule__QueryParam__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2887:1: ( ( rule__QueryParam__NameAssignment_2 ) )
            // InternalMyDsl.g:2888:2: ( rule__QueryParam__NameAssignment_2 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2889:2: ( rule__QueryParam__NameAssignment_2 )
            // InternalMyDsl.g:2889:3: rule__QueryParam__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__3"
    // InternalMyDsl.g:2897:1: rule__QueryParam__Group__3 : rule__QueryParam__Group__3__Impl ;
    public final void rule__QueryParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2901:1: ( rule__QueryParam__Group__3__Impl )
            // InternalMyDsl.g:2902:2: rule__QueryParam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3"


    // $ANTLR start "rule__QueryParam__Group__3__Impl"
    // InternalMyDsl.g:2908:1: rule__QueryParam__Group__3__Impl : ( '}' ) ;
    public final void rule__QueryParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( '}' ) )
            // InternalMyDsl.g:2913:1: ( '}' )
            {
            // InternalMyDsl.g:2913:1: ( '}' )
            // InternalMyDsl.g:2914:2: '}'
            {
             before(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3__Impl"


    // $ANTLR start "rule__PathParam__Group__0"
    // InternalMyDsl.g:2924:1: rule__PathParam__Group__0 : rule__PathParam__Group__0__Impl rule__PathParam__Group__1 ;
    public final void rule__PathParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2928:1: ( rule__PathParam__Group__0__Impl rule__PathParam__Group__1 )
            // InternalMyDsl.g:2929:2: rule__PathParam__Group__0__Impl rule__PathParam__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PathParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__0"


    // $ANTLR start "rule__PathParam__Group__0__Impl"
    // InternalMyDsl.g:2936:1: rule__PathParam__Group__0__Impl : ( '/:{' ) ;
    public final void rule__PathParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( ( '/:{' ) )
            // InternalMyDsl.g:2941:1: ( '/:{' )
            {
            // InternalMyDsl.g:2941:1: ( '/:{' )
            // InternalMyDsl.g:2942:2: '/:{'
            {
             before(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__0__Impl"


    // $ANTLR start "rule__PathParam__Group__1"
    // InternalMyDsl.g:2951:1: rule__PathParam__Group__1 : rule__PathParam__Group__1__Impl rule__PathParam__Group__2 ;
    public final void rule__PathParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( rule__PathParam__Group__1__Impl rule__PathParam__Group__2 )
            // InternalMyDsl.g:2956:2: rule__PathParam__Group__1__Impl rule__PathParam__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PathParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__1"


    // $ANTLR start "rule__PathParam__Group__1__Impl"
    // InternalMyDsl.g:2963:1: rule__PathParam__Group__1__Impl : ( ( rule__PathParam__NameAssignment_1 ) ) ;
    public final void rule__PathParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( ( ( rule__PathParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2968:1: ( ( rule__PathParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2968:1: ( ( rule__PathParam__NameAssignment_1 ) )
            // InternalMyDsl.g:2969:2: ( rule__PathParam__NameAssignment_1 )
            {
             before(grammarAccess.getPathParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2970:2: ( rule__PathParam__NameAssignment_1 )
            // InternalMyDsl.g:2970:3: rule__PathParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__1__Impl"


    // $ANTLR start "rule__PathParam__Group__2"
    // InternalMyDsl.g:2978:1: rule__PathParam__Group__2 : rule__PathParam__Group__2__Impl ;
    public final void rule__PathParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2982:1: ( rule__PathParam__Group__2__Impl )
            // InternalMyDsl.g:2983:2: rule__PathParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__2"


    // $ANTLR start "rule__PathParam__Group__2__Impl"
    // InternalMyDsl.g:2989:1: rule__PathParam__Group__2__Impl : ( '}' ) ;
    public final void rule__PathParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( '}' ) )
            // InternalMyDsl.g:2994:1: ( '}' )
            {
            // InternalMyDsl.g:2994:1: ( '}' )
            // InternalMyDsl.g:2995:2: '}'
            {
             before(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalMyDsl.g:3005:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3009:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:3010:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalMyDsl.g:3017:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3021:1: ( ( 'Response' ) )
            // InternalMyDsl.g:3022:1: ( 'Response' )
            {
            // InternalMyDsl.g:3022:1: ( 'Response' )
            // InternalMyDsl.g:3023:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getResponseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalMyDsl.g:3032:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3036:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:3037:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalMyDsl.g:3044:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3048:1: ( ( '{' ) )
            // InternalMyDsl.g:3049:1: ( '{' )
            {
            // InternalMyDsl.g:3049:1: ( '{' )
            // InternalMyDsl.g:3050:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalMyDsl.g:3059:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:3064:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Response__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalMyDsl.g:3071:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3076:1: ( 'Type' )
            {
            // InternalMyDsl.g:3076:1: ( 'Type' )
            // InternalMyDsl.g:3077:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__3"
    // InternalMyDsl.g:3086:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3090:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:3091:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Response__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3"


    // $ANTLR start "rule__Response__Group__3__Impl"
    // InternalMyDsl.g:3098:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3102:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3103:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3103:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3104:2: RULE_EQUAL
            {
             before(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__4"
    // InternalMyDsl.g:3113:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3117:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:3118:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Response__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4"


    // $ANTLR start "rule__Response__Group__4__Impl"
    // InternalMyDsl.g:3125:1: rule__Response__Group__4__Impl : ( ( rule__Response__Alternatives_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3129:1: ( ( ( rule__Response__Alternatives_4 ) ) )
            // InternalMyDsl.g:3130:1: ( ( rule__Response__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3130:1: ( ( rule__Response__Alternatives_4 ) )
            // InternalMyDsl.g:3131:2: ( rule__Response__Alternatives_4 )
            {
             before(grammarAccess.getResponseAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3132:2: ( rule__Response__Alternatives_4 )
            // InternalMyDsl.g:3132:3: rule__Response__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Response__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4__Impl"


    // $ANTLR start "rule__Response__Group__5"
    // InternalMyDsl.g:3140:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3144:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:3145:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Response__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5"


    // $ANTLR start "rule__Response__Group__5__Impl"
    // InternalMyDsl.g:3152:1: rule__Response__Group__5__Impl : ( ( rule__Response__Group_5__0 )? ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( ( ( rule__Response__Group_5__0 )? ) )
            // InternalMyDsl.g:3157:1: ( ( rule__Response__Group_5__0 )? )
            {
            // InternalMyDsl.g:3157:1: ( ( rule__Response__Group_5__0 )? )
            // InternalMyDsl.g:3158:2: ( rule__Response__Group_5__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_5()); 
            // InternalMyDsl.g:3159:2: ( rule__Response__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3159:3: rule__Response__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5__Impl"


    // $ANTLR start "rule__Response__Group__6"
    // InternalMyDsl.g:3167:1: rule__Response__Group__6 : rule__Response__Group__6__Impl rule__Response__Group__7 ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( rule__Response__Group__6__Impl rule__Response__Group__7 )
            // InternalMyDsl.g:3172:2: rule__Response__Group__6__Impl rule__Response__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Response__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6"


    // $ANTLR start "rule__Response__Group__6__Impl"
    // InternalMyDsl.g:3179:1: rule__Response__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3183:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3184:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3184:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3185:2: RULE_SEMICOLON
            {
             before(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6__Impl"


    // $ANTLR start "rule__Response__Group__7"
    // InternalMyDsl.g:3194:1: rule__Response__Group__7 : rule__Response__Group__7__Impl ;
    public final void rule__Response__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3198:1: ( rule__Response__Group__7__Impl )
            // InternalMyDsl.g:3199:2: rule__Response__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7"


    // $ANTLR start "rule__Response__Group__7__Impl"
    // InternalMyDsl.g:3205:1: rule__Response__Group__7__Impl : ( '}' ) ;
    public final void rule__Response__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( ( '}' ) )
            // InternalMyDsl.g:3210:1: ( '}' )
            {
            // InternalMyDsl.g:3210:1: ( '}' )
            // InternalMyDsl.g:3211:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7__Impl"


    // $ANTLR start "rule__Response__Group_5__0"
    // InternalMyDsl.g:3221:1: rule__Response__Group_5__0 : rule__Response__Group_5__0__Impl rule__Response__Group_5__1 ;
    public final void rule__Response__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3225:1: ( rule__Response__Group_5__0__Impl rule__Response__Group_5__1 )
            // InternalMyDsl.g:3226:2: rule__Response__Group_5__0__Impl rule__Response__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Response__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0"


    // $ANTLR start "rule__Response__Group_5__0__Impl"
    // InternalMyDsl.g:3233:1: rule__Response__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Response__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3237:1: ( ( '[' ) )
            // InternalMyDsl.g:3238:1: ( '[' )
            {
            // InternalMyDsl.g:3238:1: ( '[' )
            // InternalMyDsl.g:3239:2: '['
            {
             before(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0__Impl"


    // $ANTLR start "rule__Response__Group_5__1"
    // InternalMyDsl.g:3248:1: rule__Response__Group_5__1 : rule__Response__Group_5__1__Impl ;
    public final void rule__Response__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3252:1: ( rule__Response__Group_5__1__Impl )
            // InternalMyDsl.g:3253:2: rule__Response__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1"


    // $ANTLR start "rule__Response__Group_5__1__Impl"
    // InternalMyDsl.g:3259:1: rule__Response__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Response__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( ( ']' ) )
            // InternalMyDsl.g:3264:1: ( ']' )
            {
            // InternalMyDsl.g:3264:1: ( ']' )
            // InternalMyDsl.g:3265:2: ']'
            {
             before(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1__Impl"


    // $ANTLR start "rule__Request__Group__0"
    // InternalMyDsl.g:3275:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3279:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:3280:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Request__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // InternalMyDsl.g:3287:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3291:1: ( ( 'Request' ) )
            // InternalMyDsl.g:3292:1: ( 'Request' )
            {
            // InternalMyDsl.g:3292:1: ( 'Request' )
            // InternalMyDsl.g:3293:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // InternalMyDsl.g:3302:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3306:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:3307:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Request__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // InternalMyDsl.g:3314:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3318:1: ( ( '{' ) )
            // InternalMyDsl.g:3319:1: ( '{' )
            {
            // InternalMyDsl.g:3319:1: ( '{' )
            // InternalMyDsl.g:3320:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // InternalMyDsl.g:3329:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3333:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:3334:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Request__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // InternalMyDsl.g:3341:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3345:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3346:1: ( 'Type' )
            {
            // InternalMyDsl.g:3346:1: ( 'Type' )
            // InternalMyDsl.g:3347:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // InternalMyDsl.g:3356:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3360:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:3361:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Request__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // InternalMyDsl.g:3368:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3372:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3373:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3373:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3374:2: RULE_EQUAL
            {
             before(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // InternalMyDsl.g:3383:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3387:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:3388:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Request__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // InternalMyDsl.g:3395:1: rule__Request__Group__4__Impl : ( ( rule__Request__Alternatives_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( ( ( rule__Request__Alternatives_4 ) ) )
            // InternalMyDsl.g:3400:1: ( ( rule__Request__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3400:1: ( ( rule__Request__Alternatives_4 ) )
            // InternalMyDsl.g:3401:2: ( rule__Request__Alternatives_4 )
            {
             before(grammarAccess.getRequestAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3402:2: ( rule__Request__Alternatives_4 )
            // InternalMyDsl.g:3402:3: rule__Request__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Request__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__5"
    // InternalMyDsl.g:3410:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3414:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:3415:2: rule__Request__Group__5__Impl rule__Request__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Request__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5"


    // $ANTLR start "rule__Request__Group__5__Impl"
    // InternalMyDsl.g:3422:1: rule__Request__Group__5__Impl : ( ( rule__Request__Group_5__0 )? ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3426:1: ( ( ( rule__Request__Group_5__0 )? ) )
            // InternalMyDsl.g:3427:1: ( ( rule__Request__Group_5__0 )? )
            {
            // InternalMyDsl.g:3427:1: ( ( rule__Request__Group_5__0 )? )
            // InternalMyDsl.g:3428:2: ( rule__Request__Group_5__0 )?
            {
             before(grammarAccess.getRequestAccess().getGroup_5()); 
            // InternalMyDsl.g:3429:2: ( rule__Request__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3429:3: rule__Request__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5__Impl"


    // $ANTLR start "rule__Request__Group__6"
    // InternalMyDsl.g:3437:1: rule__Request__Group__6 : rule__Request__Group__6__Impl rule__Request__Group__7 ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3441:1: ( rule__Request__Group__6__Impl rule__Request__Group__7 )
            // InternalMyDsl.g:3442:2: rule__Request__Group__6__Impl rule__Request__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Request__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6"


    // $ANTLR start "rule__Request__Group__6__Impl"
    // InternalMyDsl.g:3449:1: rule__Request__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3454:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3454:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3455:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6__Impl"


    // $ANTLR start "rule__Request__Group__7"
    // InternalMyDsl.g:3464:1: rule__Request__Group__7 : rule__Request__Group__7__Impl ;
    public final void rule__Request__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3468:1: ( rule__Request__Group__7__Impl )
            // InternalMyDsl.g:3469:2: rule__Request__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7"


    // $ANTLR start "rule__Request__Group__7__Impl"
    // InternalMyDsl.g:3475:1: rule__Request__Group__7__Impl : ( '}' ) ;
    public final void rule__Request__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( ( '}' ) )
            // InternalMyDsl.g:3480:1: ( '}' )
            {
            // InternalMyDsl.g:3480:1: ( '}' )
            // InternalMyDsl.g:3481:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7__Impl"


    // $ANTLR start "rule__Request__Group_5__0"
    // InternalMyDsl.g:3491:1: rule__Request__Group_5__0 : rule__Request__Group_5__0__Impl rule__Request__Group_5__1 ;
    public final void rule__Request__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3495:1: ( rule__Request__Group_5__0__Impl rule__Request__Group_5__1 )
            // InternalMyDsl.g:3496:2: rule__Request__Group_5__0__Impl rule__Request__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Request__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0"


    // $ANTLR start "rule__Request__Group_5__0__Impl"
    // InternalMyDsl.g:3503:1: rule__Request__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Request__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( ( '[' ) )
            // InternalMyDsl.g:3508:1: ( '[' )
            {
            // InternalMyDsl.g:3508:1: ( '[' )
            // InternalMyDsl.g:3509:2: '['
            {
             before(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0__Impl"


    // $ANTLR start "rule__Request__Group_5__1"
    // InternalMyDsl.g:3518:1: rule__Request__Group_5__1 : rule__Request__Group_5__1__Impl ;
    public final void rule__Request__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3522:1: ( rule__Request__Group_5__1__Impl )
            // InternalMyDsl.g:3523:2: rule__Request__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1"


    // $ANTLR start "rule__Request__Group_5__1__Impl"
    // InternalMyDsl.g:3529:1: rule__Request__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Request__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( ( ']' ) )
            // InternalMyDsl.g:3534:1: ( ']' )
            {
            // InternalMyDsl.g:3534:1: ( ']' )
            // InternalMyDsl.g:3535:2: ']'
            {
             before(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalMyDsl.g:3545:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3549:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyDsl.g:3550:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalMyDsl.g:3557:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3561:1: ( ( () ) )
            // InternalMyDsl.g:3562:1: ( () )
            {
            // InternalMyDsl.g:3562:1: ( () )
            // InternalMyDsl.g:3563:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalMyDsl.g:3564:2: ()
            // InternalMyDsl.g:3564:3: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalMyDsl.g:3572:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3576:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyDsl.g:3577:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalMyDsl.g:3584:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3588:1: ( ( 'Test' ) )
            // InternalMyDsl.g:3589:1: ( 'Test' )
            {
            // InternalMyDsl.g:3589:1: ( 'Test' )
            // InternalMyDsl.g:3590:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalMyDsl.g:3599:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3603:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyDsl.g:3604:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalMyDsl.g:3611:1: rule__Test__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3615:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3616:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3616:1: ( RULE_ID )
            // InternalMyDsl.g:3617:2: RULE_ID
            {
             before(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalMyDsl.g:3626:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3630:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalMyDsl.g:3631:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalMyDsl.g:3638:1: rule__Test__Group__3__Impl : ( '{' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3642:1: ( ( '{' ) )
            // InternalMyDsl.g:3643:1: ( '{' )
            {
            // InternalMyDsl.g:3643:1: ( '{' )
            // InternalMyDsl.g:3644:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalMyDsl.g:3653:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3657:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalMyDsl.g:3658:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalMyDsl.g:3665:1: rule__Test__Group__4__Impl : ( 'service' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3669:1: ( ( 'service' ) )
            // InternalMyDsl.g:3670:1: ( 'service' )
            {
            // InternalMyDsl.g:3670:1: ( 'service' )
            // InternalMyDsl.g:3671:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalMyDsl.g:3680:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3684:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalMyDsl.g:3685:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalMyDsl.g:3692:1: rule__Test__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3696:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3697:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3697:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3698:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalMyDsl.g:3707:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3711:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalMyDsl.g:3712:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalMyDsl.g:3719:1: rule__Test__Group__6__Impl : ( ( rule__Test__ServiceAssignment_6 ) ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3723:1: ( ( ( rule__Test__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:3724:1: ( ( rule__Test__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:3724:1: ( ( rule__Test__ServiceAssignment_6 ) )
            // InternalMyDsl.g:3725:2: ( rule__Test__ServiceAssignment_6 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:3726:2: ( rule__Test__ServiceAssignment_6 )
            // InternalMyDsl.g:3726:3: rule__Test__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Test__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalMyDsl.g:3734:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3738:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalMyDsl.g:3739:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalMyDsl.g:3746:1: rule__Test__Group__7__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3750:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3751:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3751:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3752:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalMyDsl.g:3761:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3765:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalMyDsl.g:3766:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalMyDsl.g:3773:1: rule__Test__Group__8__Impl : ( 'description' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3777:1: ( ( 'description' ) )
            // InternalMyDsl.g:3778:1: ( 'description' )
            {
            // InternalMyDsl.g:3778:1: ( 'description' )
            // InternalMyDsl.g:3779:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalMyDsl.g:3788:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3792:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalMyDsl.g:3793:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalMyDsl.g:3800:1: rule__Test__Group__9__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3804:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3805:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3805:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3806:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__10"
    // InternalMyDsl.g:3815:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3819:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalMyDsl.g:3820:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalMyDsl.g:3827:1: rule__Test__Group__10__Impl : ( ( rule__Test__DescripcionAssignment_10 ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3831:1: ( ( ( rule__Test__DescripcionAssignment_10 ) ) )
            // InternalMyDsl.g:3832:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            {
            // InternalMyDsl.g:3832:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            // InternalMyDsl.g:3833:2: ( rule__Test__DescripcionAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 
            // InternalMyDsl.g:3834:2: ( rule__Test__DescripcionAssignment_10 )
            // InternalMyDsl.g:3834:3: rule__Test__DescripcionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescripcionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalMyDsl.g:3842:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3846:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalMyDsl.g:3847:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalMyDsl.g:3854:1: rule__Test__Group__11__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3858:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3859:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3859:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3860:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalMyDsl.g:3869:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3873:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalMyDsl.g:3874:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalMyDsl.g:3881:1: rule__Test__Group__12__Impl : ( ( rule__Test__Group_12__0 )? ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( ( ( rule__Test__Group_12__0 )? ) )
            // InternalMyDsl.g:3886:1: ( ( rule__Test__Group_12__0 )? )
            {
            // InternalMyDsl.g:3886:1: ( ( rule__Test__Group_12__0 )? )
            // InternalMyDsl.g:3887:2: ( rule__Test__Group_12__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_12()); 
            // InternalMyDsl.g:3888:2: ( rule__Test__Group_12__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3888:3: rule__Test__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__Test__Group__13"
    // InternalMyDsl.g:3896:1: rule__Test__Group__13 : rule__Test__Group__13__Impl rule__Test__Group__14 ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3900:1: ( rule__Test__Group__13__Impl rule__Test__Group__14 )
            // InternalMyDsl.g:3901:2: rule__Test__Group__13__Impl rule__Test__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13"


    // $ANTLR start "rule__Test__Group__13__Impl"
    // InternalMyDsl.g:3908:1: rule__Test__Group__13__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3912:1: ( ( 'Assertions' ) )
            // InternalMyDsl.g:3913:1: ( 'Assertions' )
            {
            // InternalMyDsl.g:3913:1: ( 'Assertions' )
            // InternalMyDsl.g:3914:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13__Impl"


    // $ANTLR start "rule__Test__Group__14"
    // InternalMyDsl.g:3923:1: rule__Test__Group__14 : rule__Test__Group__14__Impl rule__Test__Group__15 ;
    public final void rule__Test__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3927:1: ( rule__Test__Group__14__Impl rule__Test__Group__15 )
            // InternalMyDsl.g:3928:2: rule__Test__Group__14__Impl rule__Test__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__Test__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14"


    // $ANTLR start "rule__Test__Group__14__Impl"
    // InternalMyDsl.g:3935:1: rule__Test__Group__14__Impl : ( '{' ) ;
    public final void rule__Test__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3939:1: ( ( '{' ) )
            // InternalMyDsl.g:3940:1: ( '{' )
            {
            // InternalMyDsl.g:3940:1: ( '{' )
            // InternalMyDsl.g:3941:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14__Impl"


    // $ANTLR start "rule__Test__Group__15"
    // InternalMyDsl.g:3950:1: rule__Test__Group__15 : rule__Test__Group__15__Impl rule__Test__Group__16 ;
    public final void rule__Test__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3954:1: ( rule__Test__Group__15__Impl rule__Test__Group__16 )
            // InternalMyDsl.g:3955:2: rule__Test__Group__15__Impl rule__Test__Group__16
            {
            pushFollow(FOLLOW_35);
            rule__Test__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15"


    // $ANTLR start "rule__Test__Group__15__Impl"
    // InternalMyDsl.g:3962:1: rule__Test__Group__15__Impl : ( ( rule__Test__AsertionsAssignment_15 )* ) ;
    public final void rule__Test__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3966:1: ( ( ( rule__Test__AsertionsAssignment_15 )* ) )
            // InternalMyDsl.g:3967:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            {
            // InternalMyDsl.g:3967:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            // InternalMyDsl.g:3968:2: ( rule__Test__AsertionsAssignment_15 )*
            {
             before(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 
            // InternalMyDsl.g:3969:2: ( rule__Test__AsertionsAssignment_15 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=13 && LA30_0<=14)||LA30_0==70) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3969:3: rule__Test__AsertionsAssignment_15
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Test__AsertionsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15__Impl"


    // $ANTLR start "rule__Test__Group__16"
    // InternalMyDsl.g:3977:1: rule__Test__Group__16 : rule__Test__Group__16__Impl rule__Test__Group__17 ;
    public final void rule__Test__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3981:1: ( rule__Test__Group__16__Impl rule__Test__Group__17 )
            // InternalMyDsl.g:3982:2: rule__Test__Group__16__Impl rule__Test__Group__17
            {
            pushFollow(FOLLOW_24);
            rule__Test__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16"


    // $ANTLR start "rule__Test__Group__16__Impl"
    // InternalMyDsl.g:3989:1: rule__Test__Group__16__Impl : ( '}' ) ;
    public final void rule__Test__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3993:1: ( ( '}' ) )
            // InternalMyDsl.g:3994:1: ( '}' )
            {
            // InternalMyDsl.g:3994:1: ( '}' )
            // InternalMyDsl.g:3995:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16__Impl"


    // $ANTLR start "rule__Test__Group__17"
    // InternalMyDsl.g:4004:1: rule__Test__Group__17 : rule__Test__Group__17__Impl ;
    public final void rule__Test__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4008:1: ( rule__Test__Group__17__Impl )
            // InternalMyDsl.g:4009:2: rule__Test__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17"


    // $ANTLR start "rule__Test__Group__17__Impl"
    // InternalMyDsl.g:4015:1: rule__Test__Group__17__Impl : ( '}' ) ;
    public final void rule__Test__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( ( '}' ) )
            // InternalMyDsl.g:4020:1: ( '}' )
            {
            // InternalMyDsl.g:4020:1: ( '}' )
            // InternalMyDsl.g:4021:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17__Impl"


    // $ANTLR start "rule__Test__Group_12__0"
    // InternalMyDsl.g:4031:1: rule__Test__Group_12__0 : rule__Test__Group_12__0__Impl rule__Test__Group_12__1 ;
    public final void rule__Test__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4035:1: ( rule__Test__Group_12__0__Impl rule__Test__Group_12__1 )
            // InternalMyDsl.g:4036:2: rule__Test__Group_12__0__Impl rule__Test__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__Test__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0"


    // $ANTLR start "rule__Test__Group_12__0__Impl"
    // InternalMyDsl.g:4043:1: rule__Test__Group_12__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4047:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:4048:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:4048:1: ( 'Mapping' )
            // InternalMyDsl.g:4049:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0__Impl"


    // $ANTLR start "rule__Test__Group_12__1"
    // InternalMyDsl.g:4058:1: rule__Test__Group_12__1 : rule__Test__Group_12__1__Impl rule__Test__Group_12__2 ;
    public final void rule__Test__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4062:1: ( rule__Test__Group_12__1__Impl rule__Test__Group_12__2 )
            // InternalMyDsl.g:4063:2: rule__Test__Group_12__1__Impl rule__Test__Group_12__2
            {
            pushFollow(FOLLOW_37);
            rule__Test__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1"


    // $ANTLR start "rule__Test__Group_12__1__Impl"
    // InternalMyDsl.g:4070:1: rule__Test__Group_12__1__Impl : ( '[' ) ;
    public final void rule__Test__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4074:1: ( ( '[' ) )
            // InternalMyDsl.g:4075:1: ( '[' )
            {
            // InternalMyDsl.g:4075:1: ( '[' )
            // InternalMyDsl.g:4076:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1__Impl"


    // $ANTLR start "rule__Test__Group_12__2"
    // InternalMyDsl.g:4085:1: rule__Test__Group_12__2 : rule__Test__Group_12__2__Impl rule__Test__Group_12__3 ;
    public final void rule__Test__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4089:1: ( rule__Test__Group_12__2__Impl rule__Test__Group_12__3 )
            // InternalMyDsl.g:4090:2: rule__Test__Group_12__2__Impl rule__Test__Group_12__3
            {
            pushFollow(FOLLOW_37);
            rule__Test__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2"


    // $ANTLR start "rule__Test__Group_12__2__Impl"
    // InternalMyDsl.g:4097:1: rule__Test__Group_12__2__Impl : ( ( rule__Test__MappingsAssignment_12_2 )* ) ;
    public final void rule__Test__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4101:1: ( ( ( rule__Test__MappingsAssignment_12_2 )* ) )
            // InternalMyDsl.g:4102:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            {
            // InternalMyDsl.g:4102:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            // InternalMyDsl.g:4103:2: ( rule__Test__MappingsAssignment_12_2 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 
            // InternalMyDsl.g:4104:2: ( rule__Test__MappingsAssignment_12_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4104:3: rule__Test__MappingsAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Test__MappingsAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2__Impl"


    // $ANTLR start "rule__Test__Group_12__3"
    // InternalMyDsl.g:4112:1: rule__Test__Group_12__3 : rule__Test__Group_12__3__Impl ;
    public final void rule__Test__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4116:1: ( rule__Test__Group_12__3__Impl )
            // InternalMyDsl.g:4117:2: rule__Test__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3"


    // $ANTLR start "rule__Test__Group_12__3__Impl"
    // InternalMyDsl.g:4123:1: rule__Test__Group_12__3__Impl : ( ']' ) ;
    public final void rule__Test__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( ( ']' ) )
            // InternalMyDsl.g:4128:1: ( ']' )
            {
            // InternalMyDsl.g:4128:1: ( ']' )
            // InternalMyDsl.g:4129:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:4139:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4143:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:4144:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalMyDsl.g:4151:1: rule__Mapping__Group__0__Impl : ( '{parameter' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4155:1: ( ( '{parameter' ) )
            // InternalMyDsl.g:4156:1: ( '{parameter' )
            {
            // InternalMyDsl.g:4156:1: ( '{parameter' )
            // InternalMyDsl.g:4157:2: '{parameter'
            {
             before(grammarAccess.getMappingAccess().getParameterKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalMyDsl.g:4166:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4170:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:4171:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalMyDsl.g:4178:1: rule__Mapping__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4182:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4183:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4183:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4184:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalMyDsl.g:4193:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4197:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:4198:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalMyDsl.g:4205:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ParametroAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4209:1: ( ( ( rule__Mapping__ParametroAssignment_2 ) ) )
            // InternalMyDsl.g:4210:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            {
            // InternalMyDsl.g:4210:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            // InternalMyDsl.g:4211:2: ( rule__Mapping__ParametroAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_2()); 
            // InternalMyDsl.g:4212:2: ( rule__Mapping__ParametroAssignment_2 )
            // InternalMyDsl.g:4212:3: rule__Mapping__ParametroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ParametroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getParametroAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalMyDsl.g:4220:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4224:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:4225:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalMyDsl.g:4232:1: rule__Mapping__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4236:1: ( ( ',' ) )
            // InternalMyDsl.g:4237:1: ( ',' )
            {
            // InternalMyDsl.g:4237:1: ( ',' )
            // InternalMyDsl.g:4238:2: ','
            {
             before(grammarAccess.getMappingAccess().getCommaKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalMyDsl.g:4247:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4251:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:4252:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalMyDsl.g:4259:1: rule__Mapping__Group__4__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4263:1: ( ( 'value' ) )
            // InternalMyDsl.g:4264:1: ( 'value' )
            {
            // InternalMyDsl.g:4264:1: ( 'value' )
            // InternalMyDsl.g:4265:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalMyDsl.g:4274:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4278:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:4279:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalMyDsl.g:4286:1: rule__Mapping__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4290:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4291:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4291:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4292:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalMyDsl.g:4301:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4305:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalMyDsl.g:4306:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Mapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalMyDsl.g:4313:1: rule__Mapping__Group__6__Impl : ( ( rule__Mapping__Alternatives_6 ) ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4317:1: ( ( ( rule__Mapping__Alternatives_6 ) ) )
            // InternalMyDsl.g:4318:1: ( ( rule__Mapping__Alternatives_6 ) )
            {
            // InternalMyDsl.g:4318:1: ( ( rule__Mapping__Alternatives_6 ) )
            // InternalMyDsl.g:4319:2: ( rule__Mapping__Alternatives_6 )
            {
             before(grammarAccess.getMappingAccess().getAlternatives_6()); 
            // InternalMyDsl.g:4320:2: ( rule__Mapping__Alternatives_6 )
            // InternalMyDsl.g:4320:3: rule__Mapping__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__Mapping__Group__7"
    // InternalMyDsl.g:4328:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4332:1: ( rule__Mapping__Group__7__Impl )
            // InternalMyDsl.g:4333:2: rule__Mapping__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7"


    // $ANTLR start "rule__Mapping__Group__7__Impl"
    // InternalMyDsl.g:4339:1: rule__Mapping__Group__7__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( ( '}' ) )
            // InternalMyDsl.g:4344:1: ( '}' )
            {
            // InternalMyDsl.g:4344:1: ( '}' )
            // InternalMyDsl.g:4345:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7__Impl"


    // $ANTLR start "rule__Mapping__Group_6_0__0"
    // InternalMyDsl.g:4355:1: rule__Mapping__Group_6_0__0 : rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 ;
    public final void rule__Mapping__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4359:1: ( rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 )
            // InternalMyDsl.g:4360:2: rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0"


    // $ANTLR start "rule__Mapping__Group_6_0__0__Impl"
    // InternalMyDsl.g:4367:1: rule__Mapping__Group_6_0__0__Impl : ( 'request->' ) ;
    public final void rule__Mapping__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4371:1: ( ( 'request->' ) )
            // InternalMyDsl.g:4372:1: ( 'request->' )
            {
            // InternalMyDsl.g:4372:1: ( 'request->' )
            // InternalMyDsl.g:4373:2: 'request->'
            {
             before(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0__Impl"


    // $ANTLR start "rule__Mapping__Group_6_0__1"
    // InternalMyDsl.g:4382:1: rule__Mapping__Group_6_0__1 : rule__Mapping__Group_6_0__1__Impl ;
    public final void rule__Mapping__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4386:1: ( rule__Mapping__Group_6_0__1__Impl )
            // InternalMyDsl.g:4387:2: rule__Mapping__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1"


    // $ANTLR start "rule__Mapping__Group_6_0__1__Impl"
    // InternalMyDsl.g:4393:1: rule__Mapping__Group_6_0__1__Impl : ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) ;
    public final void rule__Mapping__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) )
            // InternalMyDsl.g:4398:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            {
            // InternalMyDsl.g:4398:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            // InternalMyDsl.g:4399:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            {
             before(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 
            // InternalMyDsl.g:4400:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            // InternalMyDsl.g:4400:3: rule__Mapping__AtributoAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__AtributoAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1__Impl"


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:4409:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4413:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:4414:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Asercion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0"


    // $ANTLR start "rule__Asercion__Group__0__Impl"
    // InternalMyDsl.g:4421:1: rule__Asercion__Group__0__Impl : ( ( rule__Asercion__Alternatives_0 ) ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4425:1: ( ( ( rule__Asercion__Alternatives_0 ) ) )
            // InternalMyDsl.g:4426:1: ( ( rule__Asercion__Alternatives_0 ) )
            {
            // InternalMyDsl.g:4426:1: ( ( rule__Asercion__Alternatives_0 ) )
            // InternalMyDsl.g:4427:2: ( rule__Asercion__Alternatives_0 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:4428:2: ( rule__Asercion__Alternatives_0 )
            // InternalMyDsl.g:4428:3: rule__Asercion__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0__Impl"


    // $ANTLR start "rule__Asercion__Group__1"
    // InternalMyDsl.g:4436:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4440:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:4441:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Asercion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1"


    // $ANTLR start "rule__Asercion__Group__1__Impl"
    // InternalMyDsl.g:4448:1: rule__Asercion__Group__1__Impl : ( ( rule__Asercion__OperadorAssignment_1 ) ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4452:1: ( ( ( rule__Asercion__OperadorAssignment_1 ) ) )
            // InternalMyDsl.g:4453:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            {
            // InternalMyDsl.g:4453:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            // InternalMyDsl.g:4454:2: ( rule__Asercion__OperadorAssignment_1 )
            {
             before(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 
            // InternalMyDsl.g:4455:2: ( rule__Asercion__OperadorAssignment_1 )
            // InternalMyDsl.g:4455:3: rule__Asercion__OperadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__OperadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1__Impl"


    // $ANTLR start "rule__Asercion__Group__2"
    // InternalMyDsl.g:4463:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4467:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:4468:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Asercion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2"


    // $ANTLR start "rule__Asercion__Group__2__Impl"
    // InternalMyDsl.g:4475:1: rule__Asercion__Group__2__Impl : ( ( rule__Asercion__Alternatives_2 ) ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4479:1: ( ( ( rule__Asercion__Alternatives_2 ) ) )
            // InternalMyDsl.g:4480:1: ( ( rule__Asercion__Alternatives_2 ) )
            {
            // InternalMyDsl.g:4480:1: ( ( rule__Asercion__Alternatives_2 ) )
            // InternalMyDsl.g:4481:2: ( rule__Asercion__Alternatives_2 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4482:2: ( rule__Asercion__Alternatives_2 )
            // InternalMyDsl.g:4482:3: rule__Asercion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2__Impl"


    // $ANTLR start "rule__Asercion__Group__3"
    // InternalMyDsl.g:4490:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4494:1: ( rule__Asercion__Group__3__Impl )
            // InternalMyDsl.g:4495:2: rule__Asercion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3"


    // $ANTLR start "rule__Asercion__Group__3__Impl"
    // InternalMyDsl.g:4501:1: rule__Asercion__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:4506:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:4506:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:4507:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3__Impl"


    // $ANTLR start "rule__Asercion__Group_0_2__0"
    // InternalMyDsl.g:4517:1: rule__Asercion__Group_0_2__0 : rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 ;
    public final void rule__Asercion__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4521:1: ( rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 )
            // InternalMyDsl.g:4522:2: rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0"


    // $ANTLR start "rule__Asercion__Group_0_2__0__Impl"
    // InternalMyDsl.g:4529:1: rule__Asercion__Group_0_2__0__Impl : ( 'response->' ) ;
    public final void rule__Asercion__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4533:1: ( ( 'response->' ) )
            // InternalMyDsl.g:4534:1: ( 'response->' )
            {
            // InternalMyDsl.g:4534:1: ( 'response->' )
            // InternalMyDsl.g:4535:2: 'response->'
            {
             before(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0__Impl"


    // $ANTLR start "rule__Asercion__Group_0_2__1"
    // InternalMyDsl.g:4544:1: rule__Asercion__Group_0_2__1 : rule__Asercion__Group_0_2__1__Impl ;
    public final void rule__Asercion__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4548:1: ( rule__Asercion__Group_0_2__1__Impl )
            // InternalMyDsl.g:4549:2: rule__Asercion__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1"


    // $ANTLR start "rule__Asercion__Group_0_2__1__Impl"
    // InternalMyDsl.g:4555:1: rule__Asercion__Group_0_2__1__Impl : ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) ;
    public final void rule__Asercion__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4559:1: ( ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) )
            // InternalMyDsl.g:4560:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            {
            // InternalMyDsl.g:4560:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            // InternalMyDsl.g:4561:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 
            // InternalMyDsl.g:4562:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            // InternalMyDsl.g:4562:3: rule__Asercion__Elemento1Assignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento1Assignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__0"
    // InternalMyDsl.g:4571:1: rule__Asercion__Group_2_1__0 : rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 ;
    public final void rule__Asercion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4575:1: ( rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 )
            // InternalMyDsl.g:4576:2: rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0"


    // $ANTLR start "rule__Asercion__Group_2_1__0__Impl"
    // InternalMyDsl.g:4583:1: rule__Asercion__Group_2_1__0__Impl : ( 'parameter.' ) ;
    public final void rule__Asercion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4587:1: ( ( 'parameter.' ) )
            // InternalMyDsl.g:4588:1: ( 'parameter.' )
            {
            // InternalMyDsl.g:4588:1: ( 'parameter.' )
            // InternalMyDsl.g:4589:2: 'parameter.'
            {
             before(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__1"
    // InternalMyDsl.g:4598:1: rule__Asercion__Group_2_1__1 : rule__Asercion__Group_2_1__1__Impl ;
    public final void rule__Asercion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4602:1: ( rule__Asercion__Group_2_1__1__Impl )
            // InternalMyDsl.g:4603:2: rule__Asercion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1"


    // $ANTLR start "rule__Asercion__Group_2_1__1__Impl"
    // InternalMyDsl.g:4609:1: rule__Asercion__Group_2_1__1__Impl : ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) ;
    public final void rule__Asercion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) )
            // InternalMyDsl.g:4614:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            {
            // InternalMyDsl.g:4614:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            // InternalMyDsl.g:4615:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 
            // InternalMyDsl.g:4616:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            // InternalMyDsl.g:4616:3: rule__Asercion__Elemento2Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento2Assignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMyDsl.g:4625:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4629:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMyDsl.g:4630:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMyDsl.g:4637:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4641:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4642:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4642:1: ( RULE_ID )
            // InternalMyDsl.g:4643:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMyDsl.g:4652:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4656:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMyDsl.g:4657:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMyDsl.g:4663:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMyDsl.g:4668:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMyDsl.g:4668:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMyDsl.g:4669:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMyDsl.g:4670:2: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==72) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4670:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMyDsl.g:4679:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4683:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMyDsl.g:4684:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMyDsl.g:4691:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4695:1: ( ( '.' ) )
            // InternalMyDsl.g:4696:1: ( '.' )
            {
            // InternalMyDsl.g:4696:1: ( '.' )
            // InternalMyDsl.g:4697:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMyDsl.g:4706:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4710:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMyDsl.g:4711:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMyDsl.g:4717:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4722:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4722:1: ( RULE_ID )
            // InternalMyDsl.g:4723:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Api__UrlAssignment_3"
    // InternalMyDsl.g:4733:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4737:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4738:2: ( ruleEString )
            {
            // InternalMyDsl.g:4738:2: ( ruleEString )
            // InternalMyDsl.g:4739:3: ruleEString
            {
             before(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__UrlAssignment_3"


    // $ANTLR start "rule__Api__EntidadesAssignment_5"
    // InternalMyDsl.g:4748:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4752:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:4753:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:4753:2: ( ruleEntidad )
            // InternalMyDsl.g:4754:3: ruleEntidad
            {
             before(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__EntidadesAssignment_5"


    // $ANTLR start "rule__Api__PrimitivetypesAssignment_6"
    // InternalMyDsl.g:4763:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4767:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:4768:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:4768:2: ( rulePrimitiveType )
            // InternalMyDsl.g:4769:3: rulePrimitiveType
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__PrimitivetypesAssignment_6"


    // $ANTLR start "rule__Api__ServiciosRestAssignment_7"
    // InternalMyDsl.g:4778:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4782:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:4783:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:4783:2: ( ruleServicioRest )
            // InternalMyDsl.g:4784:3: ruleServicioRest
            {
             before(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__ServiciosRestAssignment_7"


    // $ANTLR start "rule__Api__TestsAssignment_8"
    // InternalMyDsl.g:4793:1: rule__Api__TestsAssignment_8 : ( ruleTest ) ;
    public final void rule__Api__TestsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4797:1: ( ( ruleTest ) )
            // InternalMyDsl.g:4798:2: ( ruleTest )
            {
            // InternalMyDsl.g:4798:2: ( ruleTest )
            // InternalMyDsl.g:4799:3: ruleTest
            {
             before(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__TestsAssignment_8"


    // $ANTLR start "rule__SimpleEntity__NameAssignment_1"
    // InternalMyDsl.g:4808:1: rule__SimpleEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4812:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4813:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4813:2: ( RULE_ID )
            // InternalMyDsl.g:4814:3: RULE_ID
            {
             before(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NameAssignment_1"


    // $ANTLR start "rule__SimpleEntity__AtributosAssignment_3"
    // InternalMyDsl.g:4823:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4827:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:4828:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:4828:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:4829:3: ruleAtributoSimple
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__AtributosAssignment_3"


    // $ANTLR start "rule__AtributoMocka__TipoAssignment_0"
    // InternalMyDsl.g:4838:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4842:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4843:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4843:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4844:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__TipoAssignment_0"


    // $ANTLR start "rule__AtributoMocka__NameAssignment_1"
    // InternalMyDsl.g:4853:1: rule__AtributoMocka__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoMocka__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4857:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4858:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4858:2: ( RULE_ID )
            // InternalMyDsl.g:4859:3: RULE_ID
            {
             before(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__NameAssignment_1"


    // $ANTLR start "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"
    // InternalMyDsl.g:4868:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4872:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:4873:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:4873:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:4874:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:4875:3: ( 'PK,mockType' )
            // InternalMyDsl.g:4876:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"
    // InternalMyDsl.g:4887:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4891:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4892:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4892:2: ( ruleMockaroo )
            // InternalMyDsl.g:4893:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"
    // InternalMyDsl.g:4902:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4906:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4907:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4907:2: ( ruleMockaroo )
            // InternalMyDsl.g:4908:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"


    // $ANTLR start "rule__AtributoArreglo__TipoAssignment_0"
    // InternalMyDsl.g:4917:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4921:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4922:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4922:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4923:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__TipoAssignment_0"


    // $ANTLR start "rule__AtributoArreglo__NameAssignment_3"
    // InternalMyDsl.g:4932:1: rule__AtributoArreglo__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtributoArreglo__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4937:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4937:2: ( RULE_ID )
            // InternalMyDsl.g:4938:3: RULE_ID
            {
             before(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__NameAssignment_3"


    // $ANTLR start "rule__AtributoSimple__TipoAssignment_0"
    // InternalMyDsl.g:4947:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4952:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4952:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4953:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__TipoAssignment_0"


    // $ANTLR start "rule__AtributoSimple__NameAssignment_1"
    // InternalMyDsl.g:4962:1: rule__AtributoSimple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoSimple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4967:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4967:2: ( RULE_ID )
            // InternalMyDsl.g:4968:3: RULE_ID
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__NameAssignment_1"


    // $ANTLR start "rule__MyString__NameAssignment"
    // InternalMyDsl.g:4977:1: rule__MyString__NameAssignment : ( ruleEString ) ;
    public final void rule__MyString__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4982:2: ( ruleEString )
            {
            // InternalMyDsl.g:4982:2: ( ruleEString )
            // InternalMyDsl.g:4983:3: ruleEString
            {
             before(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__NameAssignment"


    // $ANTLR start "rule__MyNumeric__NameAssignment"
    // InternalMyDsl.g:4992:1: rule__MyNumeric__NameAssignment : ( ruleEInt ) ;
    public final void rule__MyNumeric__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4996:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:4997:2: ( ruleEInt )
            {
            // InternalMyDsl.g:4997:2: ( ruleEInt )
            // InternalMyDsl.g:4998:3: ruleEInt
            {
             before(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__NameAssignment"


    // $ANTLR start "rule__MyBoolean__NameAssignment"
    // InternalMyDsl.g:5007:1: rule__MyBoolean__NameAssignment : ( ruleEBoolean ) ;
    public final void rule__MyBoolean__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5011:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:5012:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:5012:2: ( ruleEBoolean )
            // InternalMyDsl.g:5013:3: ruleEBoolean
            {
             before(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__NameAssignment"


    // $ANTLR start "rule__MockarooEntity__NameAssignment_1"
    // InternalMyDsl.g:5022:1: rule__MockarooEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MockarooEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5026:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5027:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5027:2: ( RULE_ID )
            // InternalMyDsl.g:5028:3: RULE_ID
            {
             before(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__NameAssignment_1"


    // $ANTLR start "rule__MockarooEntity__AtributosAssignment_3"
    // InternalMyDsl.g:5037:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5041:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:5042:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:5042:2: ( ruleAtributo )
            // InternalMyDsl.g:5043:3: ruleAtributo
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__AtributosAssignment_3"


    // $ANTLR start "rule__ServicioRest__MetodoAssignment_0"
    // InternalMyDsl.g:5052:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5056:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:5057:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:5057:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:5058:3: ruleTipoMetodoRest
            {
             before(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMetodoRest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__MetodoAssignment_0"


    // $ANTLR start "rule__ServicioRest__NameAssignment_1"
    // InternalMyDsl.g:5067:1: rule__ServicioRest__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5071:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5072:2: ( ruleEString )
            {
            // InternalMyDsl.g:5072:2: ( ruleEString )
            // InternalMyDsl.g:5073:3: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__NameAssignment_1"


    // $ANTLR start "rule__ServicioRest__UrlAssignment_5"
    // InternalMyDsl.g:5082:1: rule__ServicioRest__UrlAssignment_5 : ( ruleUrl ) ;
    public final void rule__ServicioRest__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( ( ruleUrl ) )
            // InternalMyDsl.g:5087:2: ( ruleUrl )
            {
            // InternalMyDsl.g:5087:2: ( ruleUrl )
            // InternalMyDsl.g:5088:3: ruleUrl
            {
             before(grammarAccess.getServicioRestAccess().getUrlUrlParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getUrlUrlParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__UrlAssignment_5"


    // $ANTLR start "rule__ServicioRest__RequestAssignment_7"
    // InternalMyDsl.g:5097:1: rule__ServicioRest__RequestAssignment_7 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5101:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:5102:2: ( ruleRequest )
            {
            // InternalMyDsl.g:5102:2: ( ruleRequest )
            // InternalMyDsl.g:5103:3: ruleRequest
            {
             before(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__RequestAssignment_7"


    // $ANTLR start "rule__ServicioRest__ResponseAssignment_8"
    // InternalMyDsl.g:5112:1: rule__ServicioRest__ResponseAssignment_8 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5116:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:5117:2: ( ruleResponse )
            {
            // InternalMyDsl.g:5117:2: ( ruleResponse )
            // InternalMyDsl.g:5118:3: ruleResponse
            {
             before(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__ResponseAssignment_8"


    // $ANTLR start "rule__Url__UrlexpresionsAssignment_1"
    // InternalMyDsl.g:5127:1: rule__Url__UrlexpresionsAssignment_1 : ( ruleUrlExpresion ) ;
    public final void rule__Url__UrlexpresionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5131:1: ( ( ruleUrlExpresion ) )
            // InternalMyDsl.g:5132:2: ( ruleUrlExpresion )
            {
            // InternalMyDsl.g:5132:2: ( ruleUrlExpresion )
            // InternalMyDsl.g:5133:3: ruleUrlExpresion
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsUrlExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUrlExpresion();

            state._fsp--;

             after(grammarAccess.getUrlAccess().getUrlexpresionsUrlExpresionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__UrlexpresionsAssignment_1"


    // $ANTLR start "rule__StringType__TextAssignment_2"
    // InternalMyDsl.g:5142:1: rule__StringType__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__StringType__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5146:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5147:2: ( ruleEString )
            {
            // InternalMyDsl.g:5147:2: ( ruleEString )
            // InternalMyDsl.g:5148:3: ruleEString
            {
             before(grammarAccess.getStringTypeAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__TextAssignment_2"


    // $ANTLR start "rule__QueryParam__NameAssignment_2"
    // InternalMyDsl.g:5157:1: rule__QueryParam__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QueryParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5161:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5162:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5162:2: ( RULE_ID )
            // InternalMyDsl.g:5163:3: RULE_ID
            {
             before(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_2"


    // $ANTLR start "rule__PathParam__NameAssignment_1"
    // InternalMyDsl.g:5172:1: rule__PathParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PathParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5176:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5177:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5177:2: ( RULE_ID )
            // InternalMyDsl.g:5178:3: RULE_ID
            {
             before(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__NameAssignment_1"


    // $ANTLR start "rule__Response__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:5187:1: rule__Response__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Response__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5191:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5192:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5192:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5193:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5194:3: ( RULE_ID )
            // InternalMyDsl.g:5195:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Response__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:5206:1: rule__Response__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Response__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5210:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5211:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5211:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5212:3: ruleTipoAtributo
            {
             before(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__Request__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:5221:1: rule__Request__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Request__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5226:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5226:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5227:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5228:3: ( RULE_ID )
            // InternalMyDsl.g:5229:4: RULE_ID
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Request__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:5240:1: rule__Request__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Request__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5244:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5245:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5245:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5246:3: ruleTipoAtributo
            {
             before(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__PrimitiveType__NameAssignment"
    // InternalMyDsl.g:5255:1: rule__PrimitiveType__NameAssignment : ( ruleTipoAtributo ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5260:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5260:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5261:3: ruleTipoAtributo
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment"


    // $ANTLR start "rule__Test__ServiceAssignment_6"
    // InternalMyDsl.g:5270:1: rule__Test__ServiceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Test__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5275:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5275:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5276:3: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 
            // InternalMyDsl.g:5277:3: ( RULE_ID )
            // InternalMyDsl.g:5278:4: RULE_ID
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ServiceAssignment_6"


    // $ANTLR start "rule__Test__DescripcionAssignment_10"
    // InternalMyDsl.g:5289:1: rule__Test__DescripcionAssignment_10 : ( ruleEString ) ;
    public final void rule__Test__DescripcionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5293:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5294:2: ( ruleEString )
            {
            // InternalMyDsl.g:5294:2: ( ruleEString )
            // InternalMyDsl.g:5295:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__DescripcionAssignment_10"


    // $ANTLR start "rule__Test__MappingsAssignment_12_2"
    // InternalMyDsl.g:5304:1: rule__Test__MappingsAssignment_12_2 : ( ruleMapping ) ;
    public final void rule__Test__MappingsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5308:1: ( ( ruleMapping ) )
            // InternalMyDsl.g:5309:2: ( ruleMapping )
            {
            // InternalMyDsl.g:5309:2: ( ruleMapping )
            // InternalMyDsl.g:5310:3: ruleMapping
            {
             before(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__MappingsAssignment_12_2"


    // $ANTLR start "rule__Test__AsertionsAssignment_15"
    // InternalMyDsl.g:5319:1: rule__Test__AsertionsAssignment_15 : ( ruleAsercion ) ;
    public final void rule__Test__AsertionsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5323:1: ( ( ruleAsercion ) )
            // InternalMyDsl.g:5324:2: ( ruleAsercion )
            {
            // InternalMyDsl.g:5324:2: ( ruleAsercion )
            // InternalMyDsl.g:5325:3: ruleAsercion
            {
             before(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AsertionsAssignment_15"


    // $ANTLR start "rule__Mapping__ParametroAssignment_2"
    // InternalMyDsl.g:5334:1: rule__Mapping__ParametroAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ParametroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5338:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5339:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5339:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5340:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 
            // InternalMyDsl.g:5341:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5342:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ParametroAssignment_2"


    // $ANTLR start "rule__Mapping__AtributoAssignment_6_0_1"
    // InternalMyDsl.g:5353:1: rule__Mapping__AtributoAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__AtributoAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5357:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5358:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5358:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5359:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 
            // InternalMyDsl.g:5360:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5361:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__AtributoAssignment_6_0_1"


    // $ANTLR start "rule__Mapping__DatoprimitivoAssignment_6_1"
    // InternalMyDsl.g:5372:1: rule__Mapping__DatoprimitivoAssignment_6_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Mapping__DatoprimitivoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5376:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5377:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5377:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5378:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__DatoprimitivoAssignment_6_1"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_0_2_1"
    // InternalMyDsl.g:5387:1: rule__Asercion__Elemento1Assignment_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asercion__Elemento1Assignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5391:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5392:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5392:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5393:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAsercionAccess().getElemento1AtributoCrossReference_0_2_1_0()); 
            // InternalMyDsl.g:5394:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5395:4: ruleQualifiedName
            {
             before(grammarAccess.getAsercionAccess().getElemento1AtributoQualifiedNameParserRuleCall_0_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1AtributoQualifiedNameParserRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento1AtributoCrossReference_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_0_2_1"


    // $ANTLR start "rule__Asercion__OperadorAssignment_1"
    // InternalMyDsl.g:5406:1: rule__Asercion__OperadorAssignment_1 : ( ruleOperador ) ;
    public final void rule__Asercion__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5410:1: ( ( ruleOperador ) )
            // InternalMyDsl.g:5411:2: ( ruleOperador )
            {
            // InternalMyDsl.g:5411:2: ( ruleOperador )
            // InternalMyDsl.g:5412:3: ruleOperador
            {
             before(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__OperadorAssignment_1"


    // $ANTLR start "rule__Asercion__ElementoPrimitivo2Assignment_2_0"
    // InternalMyDsl.g:5421:1: rule__Asercion__ElementoPrimitivo2Assignment_2_0 : ( ruleDatoPrimitivo ) ;
    public final void rule__Asercion__ElementoPrimitivo2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5425:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5426:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5426:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5427:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getAsercionAccess().getElementoPrimitivo2DatoPrimitivoParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElementoPrimitivo2DatoPrimitivoParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__ElementoPrimitivo2Assignment_2_0"


    // $ANTLR start "rule__Asercion__Elemento2Assignment_2_1_1"
    // InternalMyDsl.g:5436:1: rule__Asercion__Elemento2Assignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asercion__Elemento2Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5440:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5441:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5441:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5442:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ParametroCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:5443:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5444:4: ruleQualifiedName
            {
             before(grammarAccess.getAsercionAccess().getElemento2ParametroQualifiedNameParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento2ParametroQualifiedNameParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento2ParametroCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento2Assignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x20101780000E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010100000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00004000000E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007FFE000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000E0040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000006000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000018070L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000018070L,0x00000000000000A0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});

}