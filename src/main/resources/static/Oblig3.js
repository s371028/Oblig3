

function sjekk() {

    const streng = $("#tall").val();

    if (streng === "" || isNaN(Number(streng))) {
        $("#feilTall").html("Skriv inn ett gyldig tall")
    } else {
        $("#feilTall").html("")
    }

}
//Har jeg har laget objekter og har jeg kodet feil melding i if setningen og i tillegg har jeg
function kjopBilleter() {

    let billett = {
        valg: $("#velgFilm").val(),
        antall: $("#tall").val(),
        fornavn: $("#forNavn").val(),
        etternavn: $("#etterNavn").val(),
        telfoonr: $("#telfonnr").val(),
        epost: $("#epost").val()

    };

    let feilMelding = 0;
    if (billett.valg === "") {
        $("#feilvalg").html("Valg en film")
        feilMelding++;
    } else {
        $("#feilvalg").html("")
    }
    if (billett.antall === "" || isNaN(billett.antall)) {
        $("#feilTall").html("Skriv inn ett gyldig tall")
        feilMelding++;
    } else {
        $("#feilTall").html("")
    }
    if (billett.fornavn === "") {
        $("#feilNavn").html("Skriv inn fornavn")
        feilMelding++;
    } else {
        $("#feilNavn").html("")
    }
    if (billett.etternavn === "") {
        $("#feilEtterNavn").html("Skriv inn etterNavn")
        feilMelding++;
    } else {
        $("#feilEtterNavn").html("")
    }
    if (billett.telfoonr === "") {
        $("#feilTelfon").html("Skriv inn telfonNummer")
        feilMelding++;
    } else {
        $("#feilTelfon").html("")
    }
    if (billett.epost === "") {
        $("#feilEpost").html("Skriv inn epost")
        feilMelding++;
    } else {
        $("#feilEpost").html("")
    }

    if (feilMelding === 0) {
        $.post("/kjopbillet", billett, function () {
            hentAllebilleter()
        })

        tomUtAlleBilletene();

    }

}
function hentAllebilleter() {
    $.get("/hentbiletter", function (data) {
        visBilletene(data)
    })
}







function visBilletene(billeter) {
    let ut = "<table><tr><th>ValgFilm</th><th>Antall</th><th>ForNavn</th><th>EtterNavn</th><th>Telefonnr</th><th>Epost</th>" +
        "</tr>";
    for (let i of billeter) {
        ut += "<tr>";
        ut += "<td>" + i.valg + "</td><td>" + i.antall + "</td><td>" + i.fornavn + "</td><td>" + i.etternavn + "</td><td>" + i.telfoonr + "</td><td>" + i.epost + "</td> "
        ut += "</tr>"
    }
    ut += "</table>"

    $("#KjopBilett").html(ut);
    // console.log(ut);



}

//Jeg har tomet alle innbuttene
function tomUtAlleBilletene() {
    $("#forNavn").val("")
    $("#etterNavn").val( "")
    $("#telfonnr").val("")
    $("#epost").val("")
    $("#tall").val("")

}

function SlettAlleBillet() {

    $.get("/slettAlleBilletter", function (){
        hentAllebilleter()
    })

}